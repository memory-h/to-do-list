package com.memoryh.todolist.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.memoryh.todolist.dto.TaskListDTO;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TaskRepositoryImpl implements TaskRepository {

    private static final String TASK_FILE_PATH = "src/main/resources/tasks.json";
    private final ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

    @Override
    public TaskListDTO readTaskListFromFile() {
        TaskListDTO taskListDTO = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(TASK_FILE_PATH), StandardCharsets.UTF_8))) {
            taskListDTO = objectMapper.readValue(reader, TaskListDTO.class);
        } catch (IOException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }
        return taskListDTO;
    }

}