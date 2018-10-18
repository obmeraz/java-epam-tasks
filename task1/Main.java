package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        double resultInMilligram = ConvertKg.toMilligram(weight);
        double resultInGram = ConvertKg.toGram(weight);
        double resultInTon = ConvertKg.toTon(weight);
        System.out.println("Milligrams:" + resultInMilligram);
        System.out.println("Grams:" + resultInGram);
        System.out.println("Tons:" + resultInTon);

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
