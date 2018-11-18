package by.epam.javatraining.zarembo.tasks.maintask01.utill;

import by.epam.javatraining.zarembo.tasks.maintask01.model.exceptions.VectorIndexOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.UpgradeVector;

import java.io.IOException;

public class UpgradeVectorInitializer {

    public static void initialize(Input input, UpgradeVector vector)
            throws IOException, VectorIndexOutOfBoundException {
        input.create(vector);
    }
}
