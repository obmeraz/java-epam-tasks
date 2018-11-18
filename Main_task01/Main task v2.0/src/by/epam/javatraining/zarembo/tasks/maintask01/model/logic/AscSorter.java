package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.Exceptions.VectorIndexOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.UpgradeVector;

public class AscSorter {

    // the worst O(n^2)
    // the best O(n)
    public static void sortWithBubbleSort(UpgradeVector vector) throws VectorIndexOutOfBoundException {
        int size = vector.size() - 1;
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size - i; j++)
                if (vector.get(j) > vector.get(j + 1)) {
                    double temp = vector.get(j);
                    vector.set(j, vector.get(j + 1));
                    vector.set(j + 1, temp);
                }
    }

    // the worst O(n^2)
    // the best O(n)
    public static void sortWithInsertionSort(UpgradeVector vector) throws VectorIndexOutOfBoundException {
        for (int i = 1; i < vector.size(); i++) {
            double key = vector.get(i);
            int j = i - 1;
            while (j >= 0 && vector.get(j) > key) {
                vector.set(j + 1, vector.get(j));
                j--;
            }
            vector.set(++j, key);
        }
    }

    // complexity:O(n^2)
    public static void sortWithSelectionSort(UpgradeVector vector) throws VectorIndexOutOfBoundException {
        int size = vector.size() - 1;
        for (int i = 0; i < size; i++) {
            int min_index = i;
            for (int j = i + 1; j < vector.size(); j++) {
                if (vector.get(j) < vector.get(min_index)) {
                    min_index = j;
                }
            }
            double temp = vector.get(min_index);
            vector.set(min_index, vector.get(i));
            vector.set(i, temp);
        }
    }

    //complexity:O(n * log(n))
    public static void sortWithMergeSort(UpgradeVector vector, int length) throws
            VectorIndexOutOfBoundException {
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        UpgradeVector l = new UpgradeVector(mid);
        UpgradeVector r = new UpgradeVector(length - mid);

        for (int i = 0; i < mid; i++) {
            l.set(i, vector.get(i));
        }
        for (int i = mid; i < length; i++) {
            r.set(i - mid, vector.get(i));
        }
        sortWithMergeSort(l, mid);
        sortWithMergeSort(r, length - mid);

        merge(vector, l, r, mid, length - mid);
    }

    //This method is addition to method sortWithMergeSortInAscOrder
    private static void merge(UpgradeVector v, UpgradeVector l, UpgradeVector r, int left, int right)
            throws VectorIndexOutOfBoundException {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l.get(i) < r.get(j)) {
                v.set(k++, l.get(i++));
            } else {
                v.set(k++, r.get(j++));
            }
        }
        while (i < left) {
            v.set(k++, l.get(i++));
        }
        while (j < right) {
            v.set(k++, r.get(j++));
        }
    }

    // the worst O(n^2)
    // the best O(n log (n))
    public static void sortWithQuickSort(UpgradeVector vector) throws VectorIndexOutOfBoundException {
        int startIndex = 0;
        int endIndex = vector.size() - 1;
        doQuickSort(startIndex, endIndex, vector);
    }

    private static void doQuickSort(int start, int end, UpgradeVector vector) throws VectorIndexOutOfBoundException {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (vector.get(i) <= vector.get(cur))) {
                i++;
            }
            while (j > cur && (vector.get(cur) <= vector.get(j))) {
                j--;
            }
            if (i < j) {
                double temp = vector.get(i);
                vector.set(i, vector.get(j));
                vector.set(j, temp);
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doQuickSort(start, cur, vector);
        doQuickSort(cur + 1, end, vector);
    }
}


