package by.epam.javatraining.zarembo.tasks.maintask01.controller;

import by.epam.javatraining.zarembo.tasks.maintask01.model.logic.Matrix;
import by.epam.javatraining.zarembo.tasks.maintask01.view.Output;

public class MatrixMethods {
    public static void executeAllMatrixMethods(double[][] matrix) {
        int[] position;
        Output.printMatrix(matrix);
        Output.loggingData("Max element in matrix:"
                + Matrix.findMaxElement(matrix));
        Output.loggingData("Min element in matrix"
                + Matrix.findMinElement(matrix));
        Output.loggingData("Average arithmetic of matrix:"
                + Matrix.findAverageArithmetic(matrix));
        Output.loggingData("Average geometric of matrix:"
                + Matrix.findAverageGeometric(matrix));
        Output.loggingData("Find first local max in matrix:");
        position = Matrix.findFirstLocalMaxPosition(matrix);
        Output.printIntArray(position);
        Output.loggingData("Find first local min in matrix:");
        position = Matrix.findFirstLocalMinPosition(matrix);
        Output.printIntArray(position);
        Output.loggingData("Is matrix symmetric on main diagonal:"
                + Matrix.isSymmetricMainDiagonal(matrix));
        Output.loggingData("Is matrix symmetric on second diagonal:"
                + Matrix.isSymmetricSecondDiagonal(matrix));
        Matrix.transposeMatrix(matrix);
        Output.printMatrix(matrix);
    }
}
