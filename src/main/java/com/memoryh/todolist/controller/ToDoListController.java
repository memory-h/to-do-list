package com.memoryh.todolist.controller;

import com.memoryh.todolist.domain.Task;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ToDoListController {

    private final TaskController taskController;

    public void run() {
        List<Task> taskList = taskController.fetchAllTasks().getTaskList();

    }

}