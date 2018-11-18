package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.Exceptions.VectorIndexOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.UpgradeVector;
import org.junit.*;

import static org.junit.Assert.*;

public class LocalPositionFinderTest {

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
    public void findFirstLocalMinPosFirst() throws VectorIndexOutOfBoundException {
        double[] array = {37.2};
        vector.setVector(array);
        int expected = 0;
        assertEquals(expected, LocalPositionFinder.findFirstLocalMinPos(vector));
    }

    @Test
    public void findFirstLocalMinPosTwo() throws VectorIndexOutOfBoundException {
        double[] array = {37.2, 44.2};
        vector.setVector(array);
        int expected = 0;
        assertEquals(expected, LocalPositionFinder.findFirstLocalMinPos(vector));
    }

    @Test
    public void findFirstLocalMinPos() throws VectorIndexOutOfBoundException {
        double[] array = {45.6, 44.2, 44.2, 17.8, 18};
        vector.setVector(array);
        int expected = 3;
        assertEquals(expected, LocalPositionFinder.findFirstLocalMinPos(vector));
    }

    @Test
    public void findFirstLocalMaxPosOne() throws VectorIndexOutOfBoundException {
        double[] array = {37.2};
        vector.setVector(array);
        int expected = 0;
        assertEquals(expected, LocalPositionFinder.findFirstLocalMaxPos(vector));
    }

    @Test
    public void findFirstLocalMaxPosTwo() throws VectorIndexOutOfBoundException {
        double[] array = {16.5, 14.4};
        vector.setVector(array);
        int expected = 0;
        assertEquals(expected, LocalPositionFinder.findFirstLocalMaxPos(vector));
    }

    @Test
    public void findFirstLocalMaxPos() throws VectorIndexOutOfBoundException {
        double[] array = {16.5, 17.4, 12.4};
        vector.setVector(array);
        int expected = 1;
        assertEquals(expected, LocalPositionFinder.findFirstLocalMaxPos(vector));
    }
}