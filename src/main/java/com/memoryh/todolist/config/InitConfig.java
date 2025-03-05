package com.memoryh.todolist.config;

import com.memoryh.todolist.controller.TaskController;
import com.memoryh.todolist.repository.TaskRepository;
import com.memoryh.todolist.repository.TaskRepositoryImpl;
import com.memoryh.todolist.service.TaskService;
import com.memoryh.todolist.service.TaskServiceImpl;

public class InitConfig {

    public TaskController taskController() {
        return new TaskController(taskService());
    }

    public TaskService taskService() {
        return new TaskServiceImpl(taskRepository());
    }

    public TaskRepository taskRepository() {
        return new TaskRepositoryImpl();
    }

}