package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.Matrix;
import by.epam.javatraining.zarembo.tasks.maintask01.model.exception.MatrixOutOfBoundException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AverageFinderTest {

    private static Matrix matrix;
    private static double[][] array = {{1.7, -4.3, 21.4}, {-21.6, 4.3, 88.8}, {23.2, 11.4, 7.8}};

    @Before
    public void setUp() {
        matrix = new Matrix(array);
    }

    @After
    public void tearDown() {
        matrix = null;
    }

    @Test
    public void findAverageArithmetic() throws MatrixOutOfBoundException {
        double expected=14.744444444444447;
        assertEquals(expected,AverageFinder.findAverageArithmetic(matrix),0.2);
    }

    @Test
    public void findAverageGeometric() throws MatrixOutOfBoundException {
        double expected=11.149087062728073;
        assertEquals(expected,AverageFinder.findAverageGeometric(matrix),0.2);

    }
}