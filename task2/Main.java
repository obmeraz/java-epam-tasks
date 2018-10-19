package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a = UserInput.inputValue();
        double b = UserInput.inputValue();
        double c = UserInput.inputValue();
        boolean result = EqualLogic.isEqual(a, b, c);
        Output.print(result);
    }
}

class EqualLogic {
    public static boolean isEqual(double a, double b, double c) {
        return a == b && b == c && c == a;
    }
}

class UserInput {
    public static double inputValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}

class Output {
    public static void print(boolean value) {
        System.out.println(value);
    }
}