package by.epam.javatraining.zarembo.controller;

import by.epam.javatraining.zarembo.model.logic.NaturalNumber;
import by.epam.javatraining.zarembo.view.Output;
import by.epam.javatraining.zarembo.view.UserInput;

public class Task32 {
    public static void main(String[] args) {
        int numberOne = UserInput.inputValue();
        int numberTwo = UserInput.inputValue();

        Output.print(NaturalNumber.findLargestDigit(numberOne));
        Output.printBoolean(NaturalNumber.isPalindrome(numberTwo));
        Output.print(NaturalNumber.findNOK(numberOne, numberTwo));
        Output.print(NaturalNumber.findNOD(numberOne, numberTwo));
        Output.printBoolean(NaturalNumber.isPrimeNumber(numberOne));
    }
}

