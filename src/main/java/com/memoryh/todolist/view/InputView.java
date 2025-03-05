package com.memoryh.todolist.view;

import com.memoryh.todolist.validator.UserInputValidator;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    private InputView() {}

    public static String getCommandInput() {
        System.out.print("추가, 수정, 삭제, 조회, 종료 중 하나를 입력하세요. (예: 추가) : ");
        String userInput = readUserInput();

        try {
            UserInputValidator.validateCommand(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getCommandInput();
        }
        return userInput;
    }

    private static String readUserInput() {
        return scanner.nextLine();
    }

}