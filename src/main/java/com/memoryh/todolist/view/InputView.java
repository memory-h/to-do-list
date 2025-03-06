package com.memoryh.todolist.view;

import com.memoryh.todolist.validator.UserInputValidator;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    private InputView() {}

    public static String getCompleted() {
        System.out.print("완료 여부를 입력하세요. (예: y) : ");
        String userInput = readUserInput().toLowerCase();
        try {
            UserInputValidator.validateUserInput(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getCompleted();
        }
        return userInput;
    }

    public static String getTaskId() {
        System.out.print("수정할 id를 입력하세요. : ");
        String userInput = readUserInput();
        try {
            UserInputValidator.isNaturalNumber(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getTaskId();
        }
        return userInput;
    }

    public static String getTitle() {
        System.out.print("제목을 입력하세요. : ");
        String userInput = readUserInput();

        try {
            UserInputValidator.validateUserInput(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getTitle();
        }
        return userInput;
    }

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