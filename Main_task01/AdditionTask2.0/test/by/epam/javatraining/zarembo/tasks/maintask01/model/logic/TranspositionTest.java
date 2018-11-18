package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.Matrix;
import by.epam.javatraining.zarembo.tasks.maintask01.model.exception.MatrixOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.exception.MatrixQuadraticException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TranspositionTest {

    private static Matrix matrix;

    @Before
    public void setUp() {
        matrix = new Matrix();
    }

    @After
    public void tearDown() {
        matrix = null;
    }

    @Test
    public void transposeMatrix() throws MatrixOutOfBoundException, MatrixQuadraticException {
        double[][] array = {{3.104, 7.218, 3.122}, {1.654, 3.212, 3.456}, {2.956, 3.888, 1.424}};
        matrix.setMatrix(array);
        double[][] expected = {{3.104, 1.654, 2.956}, {7.218, 3.212, 3.888}, {3.122, 3.456, 1.424}};
        Transposition.transposeMatrix(matrix);
        assertArrayEquals(expected, matrix.getMatrix());
    }

    @Test(expected = MatrixQuadraticException.class)
    public void transposeMatrixQuadraticException() throws MatrixOutOfBoundException, MatrixQuadraticException {
        double[][] array = {{3.104, 7.218, 3.122}};
        matrix.setMatrix(array);
        double[][] expected = {{3.104, 1.654, 2.956}, {7.218, 3.212, 3.888}, {3.122, 3.456, 1.424}};
        Transposition.transposeMatrix(matrix);
        assertArrayEquals(expected, matrix.getMatrix());
    }
}