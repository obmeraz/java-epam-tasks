package by.epam.javatraining.zarembo.tasks.maintask01.view;

import by.epam.javatraining.zarembo.tasks.maintask01.util.File;
import by.epam.javatraining.zarembo.tasks.maintask01.util.HardCode;
import by.epam.javatraining.zarembo.tasks.maintask01.util.RandomGenerator;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserInput {
    public static Scanner scanner = new Scanner(System.in);

    public static double[] fillArrayWithRandom() {
        double[] array = new double[RandomGenerator.generateIntRandomNumber()];
        for (int i = 0; i < array.length; i++) {
            array[i] = RandomGenerator.generateDoubleRandomNumber();
        }
        return array;
    }

    public static double[] fillArrayFromFile() throws FileNotFoundException {
        return File.fillArray();
    }

    public static double[] fillArrayWithHardCode() {
        return HardCode.fillArray();
    }

    public static double[][] fillMatrixWithHardCode() {
        return HardCode.fillMatrix();
    }

    public static double[][] fillMatrixWithRandom() {
        double[][] array = new double[RandomGenerator.generateIntRandomNumber()]
                [RandomGenerator.generateIntRandomNumber()];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = RandomGenerator.generateDoubleRandomNumber();
            }
        }
        return array;
    }

    public static double[][] fillMatrixFromFile() throws FileNotFoundException {
        return File.fillMatrix();
    }

    public static double inputValue() {
        return scanner.nextDouble();
    }

}
