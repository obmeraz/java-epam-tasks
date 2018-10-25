package by.epam.javatraining.zarembo.view;

import java.util.Scanner;

public class UserInput {
    public static Scanner scanner = new Scanner(System.in);

    public static int inputValue() {
        return scanner.nextInt();
    }
}
