package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.Exceptions.VectorIndexOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.UpgradeVector;

public class LocalPositionFinder {

    //find position of first local min value,checking if elements only two or one
    public static int findFirstLocalMinPos(UpgradeVector vector) throws VectorIndexOutOfBoundException {
        int position = -1;
        if (vector.size() == 1 || vector.get(0) < vector.get(1)) {
            position = 0;
            return position;
        }
        for (int i = 1; i < vector.size(); i++) {
            if (vector.get(i) < vector.get(i - 1) && vector.get(i) < vector.get(i + 1)) {
                position = i;
                break;
            }
        }
        return position;
    }

    //find position of first local max value,checking if elements only two or one
    public static int findFirstLocalMaxPos(UpgradeVector vector) throws VectorIndexOutOfBoundException {
        int position = -1;
        if (vector.size() == 1 || vector.get(0) > vector.get(1)) {
            position = 0;
            return position;
        }
        for (int i = 1; i < vector.size(); i++) {
            if (vector.get(i) > vector.get(i - 1) && vector.get(i) > vector.get(i + 1)) {
                position = i;
                break;
            }
        }
        return position;
    }


}
