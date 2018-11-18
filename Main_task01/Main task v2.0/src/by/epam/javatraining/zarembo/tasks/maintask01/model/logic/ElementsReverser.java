package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.Exceptions.VectorIndexOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.UpgradeVector;

public class ElementsReverser {

    //reverse elements of vector
    public static void reverseElements(UpgradeVector vector) throws VectorIndexOutOfBoundException {
        int size = vector.size() / 2;
        for (int i = 0, j = vector.size() - 1; i < size; i++, j--) {
            double temp = vector.get(i);
            vector.set(i, vector.get(vector.size() - i - 1));
            vector.set(vector.size() - i - 1, temp);
        }
    }
}
