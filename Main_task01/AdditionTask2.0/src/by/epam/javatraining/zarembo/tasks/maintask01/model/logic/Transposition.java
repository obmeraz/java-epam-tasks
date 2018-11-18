package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.Matrix;
import by.epam.javatraining.zarembo.tasks.maintask01.model.exception.MatrixOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.exception.MatrixQuadraticException;

public class Transposition {

    //transpose our matrix(columns will be rows)
    public static void transposeMatrix(Matrix matrix) throws MatrixOutOfBoundException, MatrixQuadraticException {
        if (matrix.sizeWithIndex(0) != matrix.size()) {
            throw new MatrixQuadraticException("Matrix should be quadratic for transposing");
        } else {
            for (int i = 0; i < matrix.size(); i++) {
                for (int j = i + 1; j < matrix.sizeWithIndex(i); j++) {
                    double temp = matrix.get(i, j);
                    matrix.set(i, j, matrix.get(j, i));
                    matrix.set(j, i, temp);
                }
            }
        }
    }
}
