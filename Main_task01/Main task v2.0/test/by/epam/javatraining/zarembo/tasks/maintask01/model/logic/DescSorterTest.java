package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.exceptions.VectorIndexOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.UpgradeVector;
import by.epam.javatraining.zarembo.tasks.maintask01.utill.RandomValue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DescSorterTest {

    public static void fillArrayWithRandom(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = RandomValue.generateDoubleValue();
        }
    }

    private static void reverseArray(double[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            double temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

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
    public void sortWithInsertionSort() throws VectorIndexOutOfBoundException {
        DescSorter.sortWithInsertionSort(vector);
        Arrays.sort(expected);
        reverseArray(expected);
        assertArrayEquals(expected, vector.getVector(), 0);
    }

    @Test
    public void sortWithSelectionSort() throws VectorIndexOutOfBoundException {
        DescSorter.sortWithSelectionSort(vector);
        Arrays.sort(expected);
        reverseArray(expected);
        assertArrayEquals(expected, vector.getVector(), 0);
    }

    @Test
    public void sortWithQuickSort() throws VectorIndexOutOfBoundException {
        DescSorter.sortWithQuickSort(vector);
        Arrays.sort(expected);
        reverseArray(expected);
        assertArrayEquals(expected, vector.getVector(), 0);
    }

    @Test
    public void sortWithMergeSort() throws VectorIndexOutOfBoundException {
        DescSorter.sortWithMergeSort(vector, vector.size());
        Arrays.sort(expected);
        reverseArray(expected);
        assertArrayEquals(expected, vector.getVector(), 0);
    }

    @Test
    public void sortWithBubbleSort() throws VectorIndexOutOfBoundException {
        DescSorter.sortWithQuickSort(vector);
        Arrays.sort(expected);
        reverseArray(expected);
        assertArrayEquals(expected, vector.getVector(), 0);
    }
}