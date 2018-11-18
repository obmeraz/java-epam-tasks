package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.Matrix;
import by.epam.javatraining.zarembo.tasks.maintask01.model.exception.MatrixOutOfBoundException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LocalFinderTest {
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
    public void findFirstLocalMinPosLast() throws MatrixOutOfBoundException {
        double[][] array = {{3, 3, 3}, {2, 2, 3}, {3, 3, 1}};
        matrix.setMatrix(array);
        int[] expected = {2, 2};
        assertArrayEquals(expected, LocalFinder.findFirstLocalMinPos(matrix));
    }

    @Test
    public void findFirstLocalMinPosFirst() throws MatrixOutOfBoundException {
        double[][] array = {{1, 3, 3}, {3, 3, 3}, {3, 3, 3}};
        matrix.setMatrix(array);
        int[] expected = {0, 0};
        assertArrayEquals(expected, LocalFinder.findFirstLocalMinPos(matrix));
    }

    @Test
    public void findFirstLocalMinPosMiddle() throws MatrixOutOfBoundException {
        double[][] array = {{2, 3, 3}, {2, 1, 3}, {3, 3, 3}};
        matrix.setMatrix(array);
        int[] expected = {1, 1};
        assertArrayEquals(expected, LocalFinder.findFirstLocalMinPos(matrix));
    }

    @Test
    public void findFirstLocalMinPosLastRowMiddle() throws MatrixOutOfBoundException {
        double[][] array = {{2, 3, 3}, {2, 3, 3}, {3, 1, 3}};
        matrix.setMatrix(array);
        int[] expected = {2, 1};
        assertArrayEquals(expected, LocalFinder.findFirstLocalMinPos(matrix));
    }

    @Test
    public void findFirstLocalMaxPosFirst() throws MatrixOutOfBoundException {
        double[][] array = {{7, 3, 3}, {1, 3, 3}, {7, 3, 1}};
        matrix.setMatrix(array);
        int[] expected = {0, 0};
        assertArrayEquals(expected, LocalFinder.findFirstLocalMaxPos(matrix));
    }

    @Test
    public void findFirstLocalMaxPosLast() throws MatrixOutOfBoundException {
        double[][] array = {{2, 3, 3}, {1, 3, 3}, {3, 3, 8}};
        matrix.setMatrix(array);
        int[] expected = {2, 2};
        assertArrayEquals(expected, LocalFinder.findFirstLocalMaxPos(matrix));
    }

    @Test
    public void findFirstLocalMaxPosMiddle() throws MatrixOutOfBoundException {
        double[][] array = {{2, 3, 3}, {1, 8, 3}, {3, 3, 7}};
        matrix.setMatrix(array);
        int[] expected = {1, 1};
        assertArrayEquals(expected, LocalFinder.findFirstLocalMaxPos(matrix));
    }

    @Test
    public void findFirstLocalMaxPosLastRowMiddle() throws MatrixOutOfBoundException {
        double[][] array = {{2, 3, 3}, {1, 3, 3}, {3, 8, 7}};
        matrix.setMatrix(array);
        int[] expected = {2, 1};
        assertArrayEquals(expected, LocalFinder.findFirstLocalMaxPos(matrix));
    }
}