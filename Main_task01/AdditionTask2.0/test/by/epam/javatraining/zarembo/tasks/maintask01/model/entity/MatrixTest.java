package by.epam.javatraining.zarembo.tasks.maintask01.model.entity;

import by.epam.javatraining.zarembo.tasks.maintask01.model.exception.MatrixOutOfBoundException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {

    private static Matrix matrix;
    private static double[][] array = {{1.7, -4.3, 21.4}, {-21.6, 4.3, 88.8}, {23.2, 11.4, 7.8}};

    @BeforeClass
    public static void setUp() {
        matrix = new Matrix(array);
    }

    @AfterClass
    public static void tearDown() {
        matrix = null;
    }

    @Test
    public void size() {
        int expected = 3;
        assertEquals(expected, matrix.size());
    }

    @Test
    public void testConstructorWithNoArg() {
        Matrix matrix = new Matrix();
        int expected = 3;
        assertEquals(expected, matrix.size(), 0.2);
    }

    @Test
    public void testConstructorWithArray() {
        double[][] expected = {{2, 5, 6}, {2, 4, 8}};
        Matrix matrix1 = new Matrix(expected);
        assertArrayEquals(expected, matrix1.getMatrix());
    }

    @Test
    public void get() throws MatrixOutOfBoundException {
        double expected = -21.6;
        assertEquals(expected, matrix.get(1, 0), 0.2);
    }


    @Test
    public void set() throws MatrixOutOfBoundException {
        double expected = 20.3;
        matrix.set(1, 0, 20.3);
        assertEquals(expected, matrix.get(1, 0), 0.2);
    }

    @Test(expected = MatrixOutOfBoundException.class)
    public void setOutOfBoundException() throws MatrixOutOfBoundException {
        double expected = 20.3;
        matrix.set(5, 0, 20.3);
        assertEquals(expected, matrix.get(5, 0), 0.2);
    }

    @Test
    public void setMatrix() {
        double[][] expected = {{20.3, 4.3}, {23.2, 11.4}};
        matrix.setMatrix(expected);
        assertArrayEquals(expected, matrix.getMatrix());
    }

    @Test
    public void getMatrix() {
        double[][] expected = {{1.7, -4.3, 21.4}, {20.3, 4.3, 88.8}, {23.2, 11.4, 7.8}};
        assertArrayEquals(expected, matrix.getMatrix());
    }

    @Test
    public void testToString() {
        String expected = "\n1.7 -4.3 21.4 \n-21.6 4.3 88.8 \n23.2 11.4 7.8 ";

        assertEquals(expected, matrix.toString());

    }
}