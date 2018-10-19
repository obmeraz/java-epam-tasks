package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = UserInput.inputValue();
        int b = UserInput.inputValue();
        SwapLogic.swapValues(a, b);
    }
}

class SwapLogic {
    public static void swapValues(int a, int b) {
        a += b - (b = a);
        Output.print(a, "a:");
        Output.print(b, "b");
    }
}

class UserInput {
    public static int inputValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

class Output {
    public static void print(double value, String str) {
        System.out.println(str + " " + value);
    }
}