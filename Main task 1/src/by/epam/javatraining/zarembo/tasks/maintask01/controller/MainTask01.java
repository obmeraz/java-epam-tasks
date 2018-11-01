/*
 * Date: 1.11.2018
 *
 * version 1.0
 * Zarembo Valentin
 *
 * There are addition and main task. Main task consists of class Array. Addition task consists of class Matrix.
 * In this classes realized the logic of our task. Also we have other packages in which we realize output,input.
 * In controller we demonstrate the work of our program.
 */

package by.epam.javatraining.zarembo.tasks.maintask01.controller;

import by.epam.javatraining.zarembo.tasks.maintask01.model.logic.Array;
import by.epam.javatraining.zarembo.tasks.maintask01.view.ConsoleOutput;
import by.epam.javatraining.zarembo.tasks.maintask01.view.UserInput;
import by.epam.javatraining.zarembo.tasks.maintask01.view.Output;

import java.io.FileNotFoundException;

public class MainTask01 {

    public static void main(String[] args) throws FileNotFoundException {
        double[] arrayRandom = UserInput.fillArrayWithRandom();
        ArrayMethods.executeAllArrayMethods(arrayRandom); //all methods Array class
        Array.sortWithSelectionSortInDescOrder(arrayRandom);
        Output.printArray(arrayRandom); //logging
        ConsoleOutput.printArrayToConsole(arrayRandom);


        double[] arrayFile = UserInput.fillArrayFromFile();
        ArrayMethods.executeAllArrayMethods(arrayFile);
        Array.sortWithQuickSortInAscOrder(arrayFile);
        Output.printArray(arrayFile);
        ConsoleOutput.printArrayToConsole(arrayFile);

        double[] arrayHardCode = UserInput.fillArrayWithHardCode();
        ArrayMethods.executeAllArrayMethods(arrayHardCode);
        Array.sortWithMergeSortInAscOrder(arrayHardCode, arrayHardCode.length);
        Output.printArray(arrayHardCode);
        ConsoleOutput.printArrayToConsole(arrayHardCode);

        double[] arrayRandomSecond = UserInput.fillArrayWithRandom();
        ArrayMethods.executeAllArrayMethods(arrayRandomSecond);
        Array.sortWithInsertionSortInDescOrder(arrayRandomSecond);
        Output.printArray(arrayRandomSecond);
        ConsoleOutput.printArrayToConsole(arrayRandomSecond);

        double[] arrayRandomThird = UserInput.fillArrayWithRandom();
        ArrayMethods.executeAllArrayMethods(arrayRandomThird);
        Array.sortWithBubbleSortInAscOrder(arrayRandomThird);
        Output.printArray(arrayRandomThird);
        ConsoleOutput.printArrayToConsole(arrayRandomThird);

        double[][] matrixRandom = UserInput.fillMatrixWithRandom();
        MatrixMethods.executeAllMatrixMethods(matrixRandom); //All methods Matrix class

        double[][] matrixFile = UserInput.fillMatrixFromFile();
        MatrixMethods.executeAllMatrixMethods(matrixFile);

        double[][] matrixHardCode = UserInput.fillMatrixWithHardCode();
        MatrixMethods.executeAllMatrixMethods(matrixHardCode);
    }
}
