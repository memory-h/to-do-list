package com.memoryh.todolist.config;

import com.memoryh.todolist.controller.TaskController;
import com.memoryh.todolist.controller.ToDoListController;
import com.memoryh.todolist.repository.TaskRepository;
import com.memoryh.todolist.repository.TaskRepositoryImpl;
import com.memoryh.todolist.repository.ToDoListRepository;
import com.memoryh.todolist.repository.ToDoListRepositoryImpl;
import com.memoryh.todolist.service.TaskService;
import com.memoryh.todolist.service.TaskServiceImpl;
import com.memoryh.todolist.service.ToDoListService;
import com.memoryh.todolist.service.ToDoListServiceImpl;

public class AppConfig {

    private static final String TASK_FILE_PATH = "src/main/resources/tasks.json";

    public ToDoListController toDoListController() {
        return new ToDoListController(taskController(), toDoListService());
    }

    public ToDoListService toDoListService() {
        return new ToDoListServiceImpl(toDoListRepository());
    }

    public ToDoListRepository toDoListRepository() {
        return new ToDoListRepositoryImpl(TASK_FILE_PATH);
    }

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