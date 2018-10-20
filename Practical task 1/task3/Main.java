package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r1 = UserInput.inputValue();
        double r2 = UserInput.inputValue();
        double s1 = Square.calcSquare(r1);
        double s2 = Square.calcSquare(r2);
        double s3 = Square.calcSquareCircle(s1, s2);
        Output.print(s3);
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
