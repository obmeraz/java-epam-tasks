package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double number = UserInput.inputValue();
        boolean result = SequenceLogic.isSequence(number);
        Output.print(result);
    }


}

class SequenceLogic {
    public static boolean isSequence(double number) {
        int fourthNum = (int) number % 10;
        number /= 10;
        int thirdNum = (int) number % 10;
        number /= 10;
        int secondNum = (int) number % 10;
        number /= 10;
        int firstNum = (int) number % 10;
        return firstNum < secondNum && secondNum < thirdNum && thirdNum < fourthNum;
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