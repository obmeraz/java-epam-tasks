package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.Matrix;
import by.epam.javatraining.zarembo.tasks.maintask01.model.exception.MatrixOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.exception.MatrixQuadraticException;

public class Symmetry {

    //checking matrix on symmetry on main diagonal
    public static boolean isSymmetricMainDiagonal(Matrix matrix) throws MatrixOutOfBoundException,
            MatrixQuadraticException {
        if (matrix.sizeWithIndex(0) != matrix.size()) {
            throw new MatrixQuadraticException("Matrix should be quadratic for symmetry");
        }
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.sizeWithIndex(i); j++) {
                if (matrix.get(i, j) != matrix.get(j, i)) {
                    return false;
                }
            }
        }
        return true;
    }

    //checking matrix on symmetry on second diagonal
    public static boolean isSymmetricSecondDiagonal(Matrix matrix) throws MatrixOutOfBoundException,
            MatrixQuadraticException {
        if (matrix.sizeWithIndex(0) != matrix.size()) {
            throw new MatrixQuadraticException("Matrix should be quadratic for symmetry");
        }
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.sizeWithIndex(i); j++) {
                if (matrix.get(i, j) != matrix.get(matrix.size() - 1 - j, matrix.size() - 1 - i)) {
                    return false;
                }
            }
        }
        return true;
    }


}
