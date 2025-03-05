package com.memoryh.todolist;

import com.memoryh.todolist.config.InitConfig;
import com.memoryh.todolist.controller.ToDoListController;

public class Application {

    public static void main(String[] args) {
        InitConfig initConfig = new InitConfig();
        ToDoListController toDoListController = new ToDoListController(initConfig.taskController());
        toDoListController.run();
    }

}