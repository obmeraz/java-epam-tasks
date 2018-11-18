package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.exceptions.VectorIndexOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.UpgradeVector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static by.epam.javatraining.zarembo.tasks.maintask01.model.logic.DescSorterTest.fillArrayWithRandom;
import static org.junit.Assert.*;

public class AscSorterTest {


    private UpgradeVector vector = new UpgradeVector();
    private double[] expected = new double[1000];
    private double[] actual = new double[1000];

    @Before
    public void setUp() {
        fillArrayWithRandom(expected);
        System.arraycopy(expected, 0, actual, 0, expected.length);
        vector.setVector(actual);

    }

    @After
    public void tearDown() {
        vector = null;
    }


    @Test
    public void sortWithBubbleSort() throws VectorIndexOutOfBoundException {
        AscSorter.sortWithBubbleSort(vector);
        Arrays.sort(expected);
        assertArrayEquals(expected, vector.getVector(), 0);
    }

    @Test
    public void sortWithMergeSort() throws VectorIndexOutOfBoundException {
        AscSorter.sortWithMergeSort(vector, vector.size());
        Arrays.sort(expected);
        assertArrayEquals(expected, vector.getVector(), 0);
    }

    @Test
    public void sortWithQuickSort() throws VectorIndexOutOfBoundException {
        AscSorter.sortWithQuickSort(vector);
        Arrays.sort(expected);
        assertArrayEquals(expected, vector.getVector(), 0);
    }

    @Test
    public void sortWithSelectionSort() throws VectorIndexOutOfBoundException {
        AscSorter.sortWithSelectionSort(vector);
        Arrays.sort(expected);
        assertArrayEquals(expected, vector.getVector(), 0);
    }

    @Test
    public void sortWithInsertionSort() throws VectorIndexOutOfBoundException {
        AscSorter.sortWithInsertionSort(vector);
        Arrays.sort(expected);
        assertArrayEquals(expected, vector.getVector(), 0);
    }


}