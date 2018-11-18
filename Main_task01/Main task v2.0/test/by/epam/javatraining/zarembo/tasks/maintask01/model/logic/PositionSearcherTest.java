package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;


import by.epam.javatraining.zarembo.tasks.maintask01.model.exceptions.VectorIndexOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.UpgradeVector;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PositionSearcherTest {

    private static UpgradeVector vector;
    private static double[] array = {21.4, 1.2, 3.4, 11.6, 7.1, -5.2, 8.4};

    @BeforeClass
    public static void setUp() {
        vector = new UpgradeVector(array);
    }

    @AfterClass
    public static void tearDown() {
        vector = null;
    }

    @Test
    public void findWithLinearSearch() throws VectorIndexOutOfBoundException {
        int expected = 6;
        double value = 8.4;
        assertEquals(expected, PositionSearcher.findWithLinearSearch(value, vector));

    }

    @Test
    public void findWithBinarySearch() throws VectorIndexOutOfBoundException {
        int expected = 4;
        double value = 8.4;
        assertEquals(expected, PositionSearcher.findWithBinarySearch(value, vector));
    }
}