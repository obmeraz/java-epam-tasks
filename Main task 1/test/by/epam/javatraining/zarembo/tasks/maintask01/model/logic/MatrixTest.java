package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import junit.framework.TestCase;
import org.junit.Assert;

public class MatrixTest extends TestCase {

    public void testFindMaxElement() {
        double[][] actual = {{13.5435, 14.7566, 22.7123}, {2.4743, 5.7123, 12.3444}, {1.2134, 6.7676, 12.3222}};
        double expected = 22.7123;
        assertEquals(Matrix.findMaxElement(actual), expected);
    }

    public void testFindMinElement() {
        double[][] actual = {{13.5435, 14.7566, 22.7123}, {2.4743, 5.7123, 12.3444}, {1.2134, 6.7676, 12.3222}};
        double expected = 1.2134;
        assertEquals(Matrix.findMinElement(actual), expected);
    }

    public void testFindAverageArithmetic() {
        double[][] actual = {{13.5435, 14.7566, 22.7123}, {2.4743, 5.7123, 12.3444}, {1.2134, 6.7676, 12.3222}};
        double expected = 10.205177777777777;
        assertEquals(Matrix.findAverageArithmetic(actual), expected);
    }

    public void testFindAverageGeometric() {
        double[][] actual = {{13.5435, 14.7566, 22.7123}, {2.4743, 5.7123, 12.3444}, {1.2134, 6.7676, 12.3222}};
        double expected = 7.554475025125637;
        assertEquals(Matrix.findAverageGeometric(actual), expected);
    }

    public void testIsSymmetricMainDiagonal() {
        double[][] actual = {{13.5435, 14.7566, 22.7123}, {14.7566, 5.7123, 12.3444}, {22.7123, 12.3444, 1.3234}};
        assertTrue(Matrix.isSymmetricMainDiagonal(actual));
    }

    public void testIsSymmetricSecondDiagonal() {
        double[][] actual = {{11, 13, 17, 10}, {13, 28, 22, 17}, {6, 22, 28, 13}, {17, 6, 13, 11}};
        assertTrue(Matrix.isSymmetricSecondDiagonal(actual));
    }

    public void testFindFirstLocalMinPosition() {
        double[][] actual = {{13.5435, 12.7566, 22.7123, 14.7566}, {14.1235, 14.8456, 21.2356, 13.2445},
                {-12.3224, 28.1233, 22.2222, -6.2213}};
        int[] expected = {0, 1};
        Assert.assertArrayEquals(Matrix.findFirstLocalMinPosition(actual), expected);
    }

    public void testFindFirstLocalMaxPosition() {
        double[][] actual = {{13.5435, 12.7566, 22.7123, 14.7566}, {14.1235, 2.8456, 21.2356, 13.2445},
                {-12.3224, 28.1233, 22.2222, -6.2213}};
        int[] expected = {0, 2};
        Assert.assertArrayEquals(Matrix.findFirstLocalMaxPosition(actual), expected);
    }

    public void testTransposeMatrix() {
        double[][] actual = {{-121.5991789, 54.3834982, -60.8127133},
                {-56.0772592, 11.4212593, 109.5243400},
                {-97.4730503, -86.4211000, -13.3293121}};
        double[][] expected = {{-121.5991789, -56.0772592, -97.4730503},
                {54.3834982, 11.4212593, -86.4211000},
                {-60.8127133, 109.5243400, -13.3293121}};
        Matrix.transposeMatrix(actual);
        Assert.assertArrayEquals(actual, expected);
    }
}