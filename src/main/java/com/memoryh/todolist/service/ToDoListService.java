package com.memoryh.todolist.service;

import com.memoryh.todolist.domain.Task;

import java.util.List;

public interface ToDoListService {

    List<Task> addTask(final List<Task> taskList, final String title);
    void convertToTaskListDTO(final List<Task> taskList);

}