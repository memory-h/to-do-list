package com.memoryh.todolist.view.constants;

import lombok.Getter;

@Getter
public enum CommandType {

    ADD("추가"),
    UPDATE("수정"),
    DELETE("삭제"),
    LIST("조회"),
    EXIT("종료");

    private final String command;

    CommandType(String command) {
        this.command = command;
    }

}