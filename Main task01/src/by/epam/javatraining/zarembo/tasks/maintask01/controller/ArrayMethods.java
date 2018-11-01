package by.epam.javatraining.zarembo.tasks.maintask01.controller;

import by.epam.javatraining.zarembo.tasks.maintask01.model.logic.Array;
import by.epam.javatraining.zarembo.tasks.maintask01.view.ConsoleOutput;
import by.epam.javatraining.zarembo.tasks.maintask01.view.Output;
import by.epam.javatraining.zarembo.tasks.maintask01.view.UserInput;

public class ArrayMethods {
    public static void executeAllArrayMethods(double[] array) {
        ConsoleOutput.printConsole("------------------");
        Output.printArray(array);
        ConsoleOutput.printArrayToConsole(array);
        Output.loggingData("Max element from Array: "
                + Array.findMaxElement(array));
        Output.loggingData("Min element from Array: "
                + Array.findMinElement(array));
        Output.loggingData("Average Arithmetic of Array: "
                + Array.findAverageArithmetic(array));
        Output.loggingData("Average Geometric of Array: "
                + Array.findAverageGeometric(array));
        Output.loggingData("Elements in desc order:  "
                + Array.isInDescendingOrder(array));
        Output.loggingData("Elements in asc order:  "
                + Array.isInAscendingOrder(array));
        Output.loggingData("First local min position in Array:  "
                + Array.findFirstLocalMinPosition(array));
        Output.loggingData("First local max position in Array:  "
                + Array.findFirstLocalMaxPosition(array));
        ConsoleOutput.printConsole("Which element need to find?");
        double value = UserInput.inputValue();
        Output.loggingData("Position of key element with linear search:  "
                + Array.findWithLinearSearch(value, array));
        Output.loggingData("Position of key element with binary search:  "
                + Array.findWithBinarySearch(value, array));
        Output.loggingData("Reverse elements of array:");
        Array.reverseElements(array);
        Output.printArray(array);
        ConsoleOutput.printConsole("------------------");
    }
}
