package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

public class Array {

    // //This method find max element in array
    public static double findMaxElement(double[] array) {
        double max_element = array[0];
        for (double anArray : array) {
            if (anArray > max_element) {
                max_element = anArray;
            }
        }
        return max_element;
    }

    //This method find min element in array
    public static double findMinElement(double[] array) {
        double min_element = array[0];
        for (double anArray : array) {
            if (anArray < min_element) {
                min_element = anArray;
            }
        }
        return min_element;
    }

    //This method average arithmetic value in matrix
    public static double findAverageArithmetic(double[] array) {
        double sum = 0;
        for (double anArray : array) {
            sum += anArray;
        }
        return sum / array.length;
    }

    //This method average geometric value in matrix
    public static double findAverageGeometric(double[] array) {
        double multiplying = 1;
        for (double anArray : array) {
            multiplying *= anArray;
        }
        return Math.pow(multiplying, 1.0 / array.length);
    }

    //This method define is our array in ascending order
    public static boolean isInAscendingOrder(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //This method define is our array in descending order
    public static boolean isInDescendingOrder(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //This method find first local min position
    public static int findFirstLocalMinPosition(double[] array) {
        int position = -1;
        if (array[0] < array[1]) {
            position = 0;
            return position;
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
                position = i;
                break;
            }
        }
        return position;
    }

    //This method find first local max position
    public static int findFirstLocalMaxPosition(double[] array) {
        int position = -1;
        if (array[0] > array[1]) {
            position = 0;
            return position;
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                position = i;
                break;
            }
        }
        return position;
    }

    //This method find position of our key value with linear search
    public static int findWithLinearSearch(double value, double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    //This method find position of our key value with binary search
    public static int findWithBinarySearch(double value, double[] array) {
        sortWithQuickSortInAscOrder(array);
        int index = 0;
        int low = 0;
        int high = array.length;
        int mid;
        while (low < high) {
            mid = (low + high) / 2;

            if (array[mid] == value) {
                index = mid;
                break;
            }

            if (array[mid] < value) {
                low = mid + 1;
            }

            if (array[mid] > value) {
                high = mid - 1;
            }
        }
        return index;
    }

    //This method reverse our elements in array without addition memory
    public static void reverseElements(double[] array) {
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            array[i] += array[j];
            array[j] = array[i] - array[j];
            array[i] -= array[j];
        }
    }

    // the worst O(n^2)
    // the best O(n)
    //This method sort our array with bubble sort
    public static void sortWithBubbleSortInAscOrder(double[] array) {
        double temp;
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    // the worst O(n^2)
    // the best O(n)
    //This method sort our array with bubble sort
    public static void sortWithInsertionSortInDescOrder(double[] array) {
        for (int i = 1; i < array.length; i++) {
            double key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j--;
            }
            array[++j] = key;
        }
    }

    // the worst O(n^2)
    // the best O(n^2)
    //This method sort our array with selection sort
    public static void sortWithSelectionSortInDescOrder(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[min_index]) {
                    min_index = j;
                }
            }
            double temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
    }

    //This method sort our array with merge sort
    public static void sortWithMergeSortInAscOrder(double[] array, int length) {
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        double[] l = new double[mid];
        double[] r = new double[length - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < length; i++) {
            r[i - mid] = array[i];
        }
        sortWithMergeSortInAscOrder(l, mid);
        sortWithMergeSortInAscOrder(r, length - mid);

        merge(array, l, r, mid, length - mid);
    }

    //This method is addition to method sortWithMergeSortInAscOrder
    private static void merge(double[] a, double[] l, double[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] < r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    // the worst O(n^2)
    // the best O(n log (n))
    //This method sort our array with quick sort
    public static void sortWithQuickSortInAscOrder(double[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        doQuickSort(startIndex, endIndex, array);
    }

    //This method is addition to main method sortWithQuickSortInAscOrder
    private static void doQuickSort(int start, int end, double[] array) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                double temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doQuickSort(start, cur, array);
        doQuickSort(cur + 1, end, array);
    }
}
