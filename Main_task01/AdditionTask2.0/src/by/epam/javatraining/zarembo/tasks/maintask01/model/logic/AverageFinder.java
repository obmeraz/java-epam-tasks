package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.Matrix;
import by.epam.javatraining.zarembo.tasks.maintask01.model.exception.MatrixOutOfBoundException;

public class AverageFinder {

    //find average arithmetic of matrix
    public static double findAverageArithmetic(Matrix matrix) throws MatrixOutOfBoundException {
        double sum = 0;
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.sizeWithIndex(i); j++) {
                sum += matrix.get(i, j);
            }
        }
        return sum / (matrix.size() * matrix.sizeWithIndex(0));
    }

    //find average geometric of matrix
    public static double findAverageGeometric(Matrix matrix) throws MatrixOutOfBoundException {
        double multiplying = 1;
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.sizeWithIndex(i); j++) {
                multiplying *= matrix.get(i, j);
            }
        }
        return Math.pow(multiplying, 1.0 / (matrix.size() * matrix.sizeWithIndex(0)));
    }

}
