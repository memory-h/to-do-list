package com.memoryh.todolist.controller;

import com.memoryh.todolist.domain.Task;
import com.memoryh.todolist.service.ToDoListService;
import com.memoryh.todolist.view.InputView;
import com.memoryh.todolist.view.OutputView;
import com.memoryh.todolist.common.constants.CommandType;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ToDoListController {

    private final TaskController taskController;
    private final ToDoListService toDoListService;

    public void run() {
        List<Task> taskList = taskController.fetchAllTasks().getTaskList();
        OutputView.printWelcomeMessage();

        while (true) {
            String command = getCommand();
            if (CommandType.EXIT.getCommand().equals(command)) {
                break;
            }
            handleCommand(taskList, command);
        }
    }

    private void handleCommand(final List<Task> taskList, final String command) {
        if (CommandType.ADD.getCommand().equals(command)) {
            String title = InputView.getTitle();
            List<Task> addedTaskList = toDoListService.addTask(taskList, title);
            toDoListService.convertToTaskListDTO(addedTaskList);
        } else if (CommandType.UPDATE.getCommand().equals(command)) {
            InputView.printUpdateIdPrompt();
            long taskId = Long.parseLong(InputView.getTaskId());
            String completed = InputView.getCompleted();

            if (completed.equals("y")) {
                toDoListService.markAsCompleted(taskList, taskId);
            }
        } else if (CommandType.DELETE.getCommand().equals(command)) {
            InputView.printDeleteIdPrompt();
            long taskId = Long.parseLong(InputView.getTaskId());
            toDoListService.deleteTask(taskList, taskId);
        } else if (CommandType.LIST.getCommand().equals(command)) {

        }
    }

    private String getCommand() {
        return InputView.getCommandInput();
    }

}