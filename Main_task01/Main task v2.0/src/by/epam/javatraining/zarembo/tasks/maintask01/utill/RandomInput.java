package by.epam.javatraining.zarembo.tasks.maintask01.utill;

import by.epam.javatraining.zarembo.tasks.maintask01.model.exceptions.VectorIndexOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.UpgradeVector;

public class RandomInput extends Input {
    @Override
    public void create(UpgradeVector vector) throws VectorIndexOutOfBoundException {
        for (int i = 0; i < vector.size(); i++) {
            vector.set(i, RandomValue.generateDoubleValue());
        }
    }
}
