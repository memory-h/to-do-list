package com.memoryh.todolist.controller;

import com.memoryh.todolist.domain.TaskList;
import com.memoryh.todolist.service.TaskService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    public TaskList fetchAllTasks(){
        return taskService.findAllTasks();
    }

}