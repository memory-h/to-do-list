package com.memoryh.todolist.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class TaskListDTO {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<TaskDTO> taskDTOList = new ArrayList<>();

}