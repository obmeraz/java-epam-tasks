package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        boolean result = isSequence(number);
        System.out.println(result);
    }

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
