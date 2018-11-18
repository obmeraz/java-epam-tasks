package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.exceptions.VectorIndexOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.UpgradeVector;

import java.util.Arrays;

public class PositionSearcher {

    //find position of element with linear search
    public static int findWithLinearSearch(double value, UpgradeVector vector) throws VectorIndexOutOfBoundException {
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) == value) {
                return i;
            }
        }
        return -1;
    }

    //find position of element with binary search
    public static int findWithBinarySearch(double value, UpgradeVector vector) throws VectorIndexOutOfBoundException {
        Arrays.sort(vector.getVector());
        int index = 0;
        int low = 0;
        int high = vector.size();
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;

            if (vector.get(mid) == value) {
                index = mid;
                break;
            }

            if (vector.get(mid) < value) {
                low = mid + 1;
            }

            if (vector.get(mid) > value) {
                high = mid - 1;
            }
        }
        return index;
    }
}
