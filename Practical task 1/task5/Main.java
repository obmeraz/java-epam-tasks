package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double number = UserInput.inputValue();
        double resultArithmetic = AverageCalc.toAverageArithmetic(number);
        double resultGeometric = AverageCalc.toAverageGeometric(number);
        Output.print(resultArithmetic);
        Output.print(resultGeometric);
    }
}

class AverageCalc {
    public static double toAverageArithmetic(double num) {
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
        return (double) (firstNum + secondNum + thirdNum + fourthNum + fiveNum + sixNum) / 6;
    }

    public static double toAverageGeometric(double num) {
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
        return Math.pow(firstNum * secondNum * thirdNum * fourthNum * fiveNum * sixNum, 1.0 / 6);
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