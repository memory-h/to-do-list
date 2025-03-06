package com.memoryh.todolist.service;

import com.memoryh.todolist.domain.Task;
import com.memoryh.todolist.dto.TaskDTO;
import com.memoryh.todolist.dto.TaskListDTO;
import com.memoryh.todolist.repository.ToDoListRepository;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RequiredArgsConstructor
public class ToDoListServiceImpl implements ToDoListService {

    private final ToDoListRepository toDoListRepository;
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    public List<Task> addTask(final List<Task> taskList, final String title) {
        Task crateTask = createTask(taskList, title);
        return addTaskList(taskList, crateTask);
    }

    @Override
    public void convertToTaskListDTO(final List<Task> taskList) {
        List<TaskDTO> taskDTOList = new TaskListDTO().getTasks();
        mapTasksToDTOs(taskList, taskDTOList);
        toDoListRepository.saveTaskListToJsonFile(taskDTOList);
    }

    private void mapTasksToDTOs(final List<Task> taskList, final List<TaskDTO> taskDTOList) {
        for (Task task : taskList) {
            taskDTOList.add(TaskDTO.of(task.getId(), task.getTitle(), task.getLocalDate(), task.isCompleted()));
        }
    }

    private List<Task> addTaskList(final List<Task> taskList, final Task task) {
        taskList.add(task);
        return taskList;
    }

    private long getLastId(final List<Task> taskList) {
        if (taskList.isEmpty()) {
            return 1L;
        }
        return taskList.get(taskList.size() - 1).getId();
    }

    private Task createTask(final List<Task> taskList, final String title) {
        long lastId = getLastId(taskList);
        return Task.of(++lastId, title, LocalDate.parse(LocalDate.now().format(dateTimeFormatter)), false);
    }

}