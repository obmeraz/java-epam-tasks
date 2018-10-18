package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        double result = isReverse(number);
        System.out.println(result);
    }

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
        return seventhNum * 1000000 + sixNum * 100000 + fiveNum * 10000 + fourthNum * 1000 +
                thirdNum * 100 + secondNum * 10 + firstNum;
    }
}
