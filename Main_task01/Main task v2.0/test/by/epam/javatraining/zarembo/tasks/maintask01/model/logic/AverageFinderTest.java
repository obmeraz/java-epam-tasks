package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.exceptions.VectorIndexOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.UpgradeVector;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AverageFinderTest {

    private static UpgradeVector vector;
    private static double[] array = {12.4, 7.5, -14.1, 22.6, 81.2, 5.4, -5.3};

    @BeforeClass
    public static void setUp() {
        vector = new UpgradeVector(array);
    }

    @AfterClass
    public static void tearDown() {
        vector = null;
    }

    @Test
    public void findAverageArithmetic() throws VectorIndexOutOfBoundException {
        double expected = 15.671428571428573;
        assertEquals(expected, AverageFinder.findAverageArithmetic(vector), 0);

    }

    @Test
    public void findAverageGeometric() throws VectorIndexOutOfBoundException {
        double expected = 13.174054364659584;
        assertEquals(expected, AverageFinder.findAverageGeometric(vector), 0);
    }
}