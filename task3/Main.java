package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r1 = scanner.nextDouble();
        double r2 = scanner.nextDouble();
        double S1 = Square.calcSquare(r1);
        double S2 = Square.calcSquare(r2);
        double S3 = Square.calcSquareCircle(S1, S2);
        System.out.println(S3);
    }
}

class Square {
    public static double calcSquare(double R) {
        return Math.PI * R;
    }

    public static double calcSquareCircle(double S1, double S2) {
        return S1 - S2;
    }
}

