package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.Exceptions.VectorIndexOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.UpgradeVector;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElementsReverserTest {

    @Test
    public void reverseElements() throws VectorIndexOutOfBoundException {
        double[] array = {2.4, 11.7, 3.8, 4.5};
        UpgradeVector vector = new UpgradeVector(array);
        double[] expected = {4.5, 3.8, 11.7, 2.4};
        ElementsReverser.reverseElements(vector);
        assertArrayEquals(expected, vector.getVector(), 0);
    }
}