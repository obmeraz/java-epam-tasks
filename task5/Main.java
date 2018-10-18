package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        double resultArithmetic = AverageCalc.toAverageArithmetic(number);
        System.out.println(resultArithmetic);
        double resultGeometric = AverageCalc.toAverageGeometric(number);
        System.out.println(resultGeometric);
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