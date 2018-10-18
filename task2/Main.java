package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        boolean equal = isEqual(a, b, c);
        System.out.println(equal);
    }

    private static boolean isEqual(double a, double b, double c) {
        return a == b && b == c && c == a;
    }
}
