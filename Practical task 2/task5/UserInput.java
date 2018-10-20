package com.company;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputValue() {
        return scanner.nextInt();
    }
}
