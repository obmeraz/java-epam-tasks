package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.exceptions.VectorIndexOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.UpgradeVector;

public class ExtremerFinder {

    //find max value in vector
    public static double findMaxValue(UpgradeVector vector) throws VectorIndexOutOfBoundException {
        double maxValue = vector.get(0);
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) > maxValue) {
                maxValue = vector.get(i);
            }
        }
        return maxValue;
    }

    public static double findMinValue(UpgradeVector vector) throws VectorIndexOutOfBoundException {
        double minValue = vector.get(0);
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) < minValue) {
                minValue = vector.get(i);
            }
        }
        return minValue;
    }


}
