package by.epam.javatraining.zarembo.tasks.maintask01.controller;

import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.Matrix;
import by.epam.javatraining.zarembo.tasks.maintask01.model.exception.MatrixOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.exception.MatrixQuadraticException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.logic.AverageFinder;
import by.epam.javatraining.zarembo.tasks.maintask01.model.logic.ExtremeFinder;
import by.epam.javatraining.zarembo.tasks.maintask01.model.logic.LocalFinder;
import by.epam.javatraining.zarembo.tasks.maintask01.model.logic.Transposition;
import by.epam.javatraining.zarembo.tasks.maintask01.util.*;
import by.epam.javatraining.zarembo.tasks.maintask01.view.Output;

import java.io.FileNotFoundException;

public class MainTask01 {

    public static void main(String[] args) {
        int[] position;
        double[][] array = new double[5][5];
        try {
            Matrix matrix = new Matrix(array);
            Matrix matrix1 = new Matrix(5, 5);
            Matrix matrix2 = new Matrix();
            Matrix matrix3 = new Matrix();
            Selector selector = new Randomizer();
            Selector selector2 = new FileInput();
            Selector selector3 = new HardCode();

            MatrixInitializer.initialize(selector3, matrix3);
            MatrixInitializer.initialize(selector, matrix);
            MatrixInitializer.initialize(selector2, matrix2);

            Output.printMatrix(matrix3);
            Output.printMatrix(matrix2);
            Output.printMatrix(matrix);

            Output.logInformation("Average arithmetic:" + AverageFinder.findAverageArithmetic(matrix));
            Output.logInformation("Average geometric:" + AverageFinder.findAverageGeometric(matrix));
            Output.logInformation("Max value:" + ExtremeFinder.findMaxValue(matrix));
            Output.logInformation("Min value:" + ExtremeFinder.findMinValue(matrix));

            position = LocalFinder.findFirstLocalMaxPos(matrix);
            Output.logInformation("Local max pos:");

            Output.printArray(position);
            position = LocalFinder.findFirstLocalMinPos(matrix);

            Output.logInformation("Local min pos:");

            Output.printArray(position);

            Transposition.transposeMatrix(matrix);

            Output.printMatrix(matrix);
        } catch (MatrixOutOfBoundException
                | MatrixQuadraticException e) {
            e.printStackTrace();
        }
    }
}
