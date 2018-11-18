package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;


import by.epam.javatraining.zarembo.tasks.maintask01.model.Exceptions.VectorIndexOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.UpgradeVector;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderCheckerTest {

    private static UpgradeVector vector;
    private static double[] array = {1.2, 3.4, 11.6, 21.4};

    @BeforeClass
    public static void setUp() {
        vector = new UpgradeVector(array);
    }

    @AfterClass
    public static void tearDown() {
        vector = null;
    }


    @Test
    public void isInAscendingOrder() throws VectorIndexOutOfBoundException {
        assertTrue(OrderChecker.isInAscendingOrder(vector));
    }

    @Test
    public void isInDescendingOrder() throws VectorIndexOutOfBoundException {
        assertFalse(OrderChecker.isInDescendingOrder(vector));
    }
}