package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number = UserInput.inputValue();
        double result = ReverseLogic.isReverse(number);
        Output.print(result);
    }
}

class ReverseLogic {
    public static final int ONE_MILLION = 1000000;
    public static final int HUNDRED_THOUSAND = 100000;
    public static final int TEN_THOUSAND = 10000;
    public static final int ONE_THOUSAND = 1000;
    public static final int ONE_HUNDRED = 100;
    public static final int TEN = 10;

    public static double isReverse(double num) {
        int seventhNum = (int) num % 10;
        num /= 10;
        int sixNum = (int) num % 10;
        num /= 10;
        int fiveNum = (int) num % 10;
        num /= 10;
        int fourthNum = (int) num % 10;
        num /= 10;
        int thirdNum = (int) num % 10;
        num /= 10;
        int secondNum = (int) num % 10;
        num /= 10;
        int firstNum = (int) num;
        return seventhNum * ONE_MILLION + sixNum * HUNDRED_THOUSAND + fiveNum * TEN_THOUSAND +
                fourthNum * ONE_THOUSAND +
                thirdNum * ONE_HUNDRED + secondNum * TEN + firstNum;
    }
}

class UserInput {
    public static double inputValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}

class Output {
    public static void print(double value) {
        System.out.println(value);
    }
}