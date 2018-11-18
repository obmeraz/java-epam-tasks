package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.Matrix;
import by.epam.javatraining.zarembo.tasks.maintask01.model.exception.MatrixOutOfBoundException;

public class ExtremeFinder {

    //find max value in matrix
    public static double findMaxValue(Matrix matrix) throws MatrixOutOfBoundException {
        double maxValue = matrix.get(0, 0);
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.sizeWithIndex(i); j++) {
                if (matrix.get(i, j) > maxValue) {
                    maxValue = matrix.get(i, j);
                }
            }
        }
        return maxValue;
    }

    //find min value in matrix
    public static double findMinValue(Matrix matrix) throws MatrixOutOfBoundException {
        double minValue = matrix.get(0, 0);
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.sizeWithIndex(i); j++) {
                if (matrix.get(i, j) < minValue) {
                    minValue = matrix.get(i, j);
                }
            }
        }
        return minValue;
    }
}
