package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.exceptions.VectorIndexOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.UpgradeVector;
import org.junit.*;

import static org.junit.Assert.*;

public class ExtremerFinderTest {

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
    public void findMaxValue() throws VectorIndexOutOfBoundException {
        double expected = 81.2;
        assertEquals(expected, ExtremerFinder.findMaxValue(vector), 0);
    }

    @Test
    public void findMinValue() throws VectorIndexOutOfBoundException {
        double expected = -14.1;
        assertEquals(expected, ExtremerFinder.findMinValue(vector), 0);
    }
}