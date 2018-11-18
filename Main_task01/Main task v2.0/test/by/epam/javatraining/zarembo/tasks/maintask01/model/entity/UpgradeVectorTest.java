package by.epam.javatraining.zarembo.tasks.maintask01.model.entity;

import by.epam.javatraining.zarembo.tasks.maintask01.model.exceptions.VectorIndexOutOfBoundException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UpgradeVectorTest {
    private UpgradeVector vector;

    @Before
    public void setUp() {
        vector = new UpgradeVector();
    }

    @After
    public void tearDown() {
        vector = null;
    }

    @Test
    public void testConstructorWithNoParam() {
        UpgradeVector vector = new UpgradeVector();
        int expected = 10;
        assertEquals(expected, vector.size());
    }

    @Test
    public void testConstructorWithParamArray() {
        double[] expected = {2, 5, 6, 8};
        UpgradeVector vector = new UpgradeVector(expected);
        assertArrayEquals(expected, vector.getVector(), 0.2);
    }

    @Test
    public void testConstructorWithSize() {
        UpgradeVector vector = new UpgradeVector(5);
        int expected = 5;
        assertEquals(expected, vector.size());
    }

    @Test
    public void size() {
        int expected = UpgradeVector.DEFAULT_SIZE;
        assertEquals(expected, vector.size());
    }

    @Test
    public void get() throws VectorIndexOutOfBoundException {
        double[] array = {2.2, 1.7, 3, 12.44};
        UpgradeVector vector = new UpgradeVector(array);
        double expected = 3;
        assertEquals(expected, vector.get(2), 0.2);
    }

    @Test(expected = VectorIndexOutOfBoundException.class)
    public void getOutOfBounds() throws VectorIndexOutOfBoundException {
        vector.get(11);
        double expected = 12.4;
        assertEquals(expected, vector.get(-2), 0.2);
    }

    @Test
    public void set() throws VectorIndexOutOfBoundException {
        vector.set(9, 12.4);
        double expected = 12.4;
        assertEquals(expected, vector.get(9), 0.2);
    }

    @Test(expected = VectorIndexOutOfBoundException.class)
    public void setOutOfBounds() throws VectorIndexOutOfBoundException {
        vector.set(-1, 12.4);
        double expected = 12.4;
        assertEquals(expected, vector.get(-1), 0.2);
    }


    @Test
    public void getVector() {
        double[] actual = {11.6, 2.6, 3.8, -14.2, 27.4, 0.0, 0.0, 0.0, 0.0, 0.0};
        vector.setVector(actual);
        double[] expectedArray = {11.6, 2.6, 3.8, -14.2, 27.4, 0.0, 0.0, 0.0, 0.0, 0.0};
        assertArrayEquals(expectedArray, vector.getVector(), 0.2);
    }

    @Test
    public void testToString() {
        double[] array = {1, 2, 3, 4, 5};
        UpgradeVector vector = new UpgradeVector(array);
        String expected = "[1.0 2.0 3.0 4.0 5.0 ]";

        assertEquals(expected, vector.toString());

    }

}