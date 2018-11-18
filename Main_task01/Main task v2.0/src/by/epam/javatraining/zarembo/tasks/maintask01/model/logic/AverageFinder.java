package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.exceptions.VectorIndexOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.UpgradeVector;

public class AverageFinder {

    //find average arithmetic
    public static double findAverageArithmetic(UpgradeVector vector) throws VectorIndexOutOfBoundException {
        double sum = 0;
        for (int i = 0; i < vector.size(); i++) {
            sum += vector.get(i);
        }
        return sum / vector.size();
    }

    //find average geometric
    public static double findAverageGeometric(UpgradeVector vector) throws VectorIndexOutOfBoundException {
        double multiplying = 1;
        for (int i = 0; i < vector.size(); i++) {
            multiplying *= vector.get(i);
        }
        return Math.pow(multiplying, 1. / vector.size());
    }
}
