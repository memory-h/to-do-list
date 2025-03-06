package com.memoryh.todolist.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class TaskDTO {

    private Long id;

    private String title;

    @JsonProperty("dueDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate localDate;

    private boolean completed;

    private TaskDTO(final Long id, final String title, final LocalDate localDate, final boolean completed) {
        this.id = id;
        this.title = title;
        this.localDate = localDate;
        this.completed = completed;
    }

    public static TaskDTO of(final Long id, final String title, final LocalDate localDate, final boolean completed) {
        return new TaskDTO(id, title, localDate, completed);
    }

}