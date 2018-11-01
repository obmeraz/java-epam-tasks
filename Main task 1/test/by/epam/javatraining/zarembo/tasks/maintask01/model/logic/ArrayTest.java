package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import junit.framework.TestCase;
import org.junit.Assert;

public class ArrayTest extends TestCase {

    public void testFindMaxValue() {
        double[] actual = {6.5, 47, 3, 21, 4};
        double expected = 47;
        assertEquals(Array.findMaxElement(actual), expected);
    }

    public void testFindMinValue() {
        double[] actual = {6.5, 47, 2.1, 2.0, 4};
        double expected = 2.0;
        assertEquals(Array.findMinElement(actual), expected);
    }

    public void testFindAverageArithmetic() {
        double[] actual = {14.3, 18, 1.4, 9, 15};
        double expected = 11.54;
        assertEquals(Array.findAverageArithmetic(actual), expected);
    }

    public void testFindAverageGeometric() {
        double[] actual = {14.3, 18, 1.4, 9, 15};
        double expected = 8.657929983249623;
        assertEquals(Array.findAverageGeometric(actual), expected);
    }

    public void testIsInAscendingOrder() {
        double[] actual = {2, 3, 5, 6};
        assertTrue(Array.isInAscendingOrder(actual));
    }

    public void testIsInDescendingOrder() {
        double[] actual = {5, 4, 3, 2};
        assertTrue(Array.isInDescendingOrder(actual));
    }

    public void testFindFirstLocalMinPosition() {
        double[] actual = {17.3, 17.3, 17.3, 1.3, 17.3, 13};
        int expected = 3;
        assertEquals(Array.findFirstLocalMinPosition(actual), expected);
    }

    public void testFindFirstLocalMaxPosition() {
        double[] actual = {2.3, 8.3, 17.3, 1.3, 17.3, 13};
        int expected = 2;
        assertEquals(Array.findFirstLocalMaxPosition(actual), expected);
    }

    public void testFindWithLinearSearch() {
        double[] actual = {17.3, 22, 13, 17.3, 14, 22};
        int expected = 1;
        double value = 22;
        assertEquals(Array.findWithLinearSearch(value, actual), expected);
    }

    public void testFindWithBinarySearch() {
        double[] actual = {17.3, 12, 13, 2.3, 14, 22};
        int expected = 0;
        double value = 2.3;
        assertEquals(Array.findWithBinarySearch(value, actual), expected);
    }

    public void testReverseElements() {
        double[] actual = {17.3234, 12.4322, 13.1232, 2.3123, -14.5678, 22.2134};
        double[] expected = {22.2134, -14.5678, 2.3123, 13.1232, 12.4322, 17.3234};
        Array.reverseElements(actual);
        Assert.assertArrayEquals(actual, expected, 4);
    }

    public void testSortWithBubbleSortInAscOrder() {
        double[] actual = {17.3234, -12.4322, 13.1232, 2.3123, -14.5678, 22.2134};
        double[] expected = {-14.5678, -12.4322, 2.3123, 13.1232, 17.3234, 22.2134};
        Array.sortWithBubbleSortInAscOrder(actual);
        Assert.assertArrayEquals(actual, expected, 4);
    }


    public void testSortWithInsertionSortInDescOrder() {
        double[] actual = {17.3234, -12.4322, 13.1232, 2.3123, -14.5678, 22.2134};
        double[] expected = {22.2134, 17.3234, 13.1232, 2.3123, -12.4322, -14.5678};
        Array.sortWithInsertionSortInDescOrder(actual);
        Assert.assertArrayEquals(actual, expected, 4);
    }

    public void testSortWithSelectionSortInDescOrder() {
        double[] actual = {17.3234, -12.4322, 13.1232, 2.3123, -14.5678, 22.2134};
        double[] expected = {22.2134, 17.3234, 13.1232, 2.3123, -12.4322, -14.5678};
        Array.sortWithSelectionSortInDescOrder(actual);
        Assert.assertArrayEquals(actual, expected, 4);
    }

    public void testSortWithMergeSortInAscOrder() {
        double[] actual = {17.3234, -12.4322, 13.1232, 2.3123, -14.5678, 22.2134};
        double[] expected = {-14.5678, -12.4322, 2.3123, 13.1232, 17.3234, 22.2134};
        Array.sortWithMergeSortInAscOrder(actual, actual.length);
        Assert.assertArrayEquals(actual, expected, 4);
    }

    public void testSortWithQuickSortInAscOrder() {
        double[] actual = {17.3234, -12.4322, 13.1232, 2.3123, -14.5678, 22.2134};
        double[] expected = {-14.5678, -12.4322, 2.3123, 13.1232, 17.3234, 22.2134};
        Array.sortWithQuickSortInAscOrder(actual);
        Assert.assertArrayEquals(actual, expected, 4);
    }
}