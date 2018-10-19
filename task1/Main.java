package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double weight = UserInput.inputValue();
        double resultInMilligram = ConvertKg.toMilligram(weight);
        double resultInGram = ConvertKg.toGram(weight);
        double resultInTon = ConvertKg.toTon(weight);
        Output.print(resultInMilligram, "Milligrams:");
        Output.print(resultInGram, "Grams:");
        Output.print(resultInTon, "Tons:");

    }
}

class ConvertKg {
    private static final int IN_MILLIGRAM_VALUE = 1000000;
    private static final int IN_GRAM_VALUE = 1000;
    private static final int IN_TON_VALUE = 1000;

    public static double toMilligram(double weight) {
        return weight *= IN_MILLIGRAM_VALUE;
    }

    public static double toGram(double weight) {
        return weight *= IN_GRAM_VALUE;
    }

    public static double toTon(double weight) {
        return weight /= IN_TON_VALUE;
    }
}

class UserInput {
    public static double inputValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}

class Output {
    public static void print(double value, String str) {
        System.out.println(str + " " + value);
    }
}
