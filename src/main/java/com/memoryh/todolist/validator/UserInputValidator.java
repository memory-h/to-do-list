package com.memoryh.todolist.validator;

import com.memoryh.todolist.view.constants.CommandType;

import java.util.Arrays;

public class UserInputValidator {

    private UserInputValidator() {}

    public static void validateUserInput(final String userInput) {
        if (userInput == null || userInput.isBlank()) {
            throw new IllegalArgumentException("[ERROR] 입력값은 비어있을 수 없습니다.");
        }
    }

    public static void validateCommand(final String command) {
        validateUserInput(command);
        boolean isValid = Arrays.stream(CommandType.values())
                .anyMatch(cmd -> cmd.getCommand().equals(command));

        if (!isValid) {
            throw new IllegalArgumentException("[ERROR] 추가, 수정, 삭제, 조회, 종료 중 1개만 입력 가능합니다.");
        }
    }

}