package com.company;

import java.util.Scanner;

public class UserInput {
    public static Scanner scanner = new Scanner(System.in);

    public static char inputValue() {
        return scanner.next().charAt(0);
    }
}
