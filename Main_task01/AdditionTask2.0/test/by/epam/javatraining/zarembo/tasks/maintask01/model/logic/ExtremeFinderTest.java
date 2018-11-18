package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.Matrix;
import by.epam.javatraining.zarembo.tasks.maintask01.model.exception.MatrixOutOfBoundException;
import org.junit.*;

import static org.junit.Assert.*;

public class ExtremeFinderTest {

    private static Matrix matrix;
    private static double[][] array={{1.7,-4.3,21.4},{-21.6,4.3,88.8},{23.2,11.4,7.8}};


    @BeforeClass
    public static void setUp() {
        matrix = new Matrix(array);
    }

    @AfterClass
    public static void tearDown(){
        matrix = null;
    }

    @Test
    public void findMaxValue() throws MatrixOutOfBoundException {
        double expected=88.8;
        assertEquals(expected,ExtremeFinder.findMaxValue(matrix),0.2);
    }

    @Test
    public void findMinValue() throws MatrixOutOfBoundException {
        double expected=-21.6;
        assertEquals(expected,ExtremeFinder.findMinValue(matrix),0.2);
    }
}