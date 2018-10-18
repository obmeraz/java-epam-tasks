package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        swapValues(a, b);
    }

    public static void swapValues(int a, int b) {
        a += b - (b = a);
        System.out.println("a:" + a + " " + "b:" + b);
    }
}
