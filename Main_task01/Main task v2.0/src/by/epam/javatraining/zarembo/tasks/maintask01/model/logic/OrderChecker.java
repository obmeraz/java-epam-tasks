package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.Exceptions.VectorIndexOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.UpgradeVector;

public class OrderChecker {

    //checking if elements in asc order
    public static boolean isInAscendingOrder(UpgradeVector vector) throws VectorIndexOutOfBoundException {
        int size = vector.size() - 1;
        for (int i = 0; i < size; i++) {
            if (vector.get(i) > vector.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    //checking if elements in desc order
    public static boolean isInDescendingOrder(UpgradeVector vector) throws VectorIndexOutOfBoundException {
        int size = vector.size() - 1;
        for (int i = 0; i < size; i++) {
            if (vector.get(i) < vector.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

}
