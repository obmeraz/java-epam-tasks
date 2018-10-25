package by.epam.javatraining.zarembo.controller;

import by.epam.javatraining.zarembo.model.logic.PerfectNumber;
import by.epam.javatraining.zarembo.view.Output;
import by.epam.javatraining.zarembo.view.UserInput;

public class Task33 {
    public static void main(String[] args) {
        int number = UserInput.inputValue();
        Output.print(PerfectNumber.isPerfectNumber(number));
    }
}
