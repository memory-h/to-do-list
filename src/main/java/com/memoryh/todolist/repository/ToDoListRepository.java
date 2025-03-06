package com.memoryh.todolist.repository;

import com.memoryh.todolist.dto.TaskDTO;

import java.util.List;

public interface ToDoListRepository {

    void saveTaskListToJsonFile(final List<TaskDTO> taskDTOList);

}