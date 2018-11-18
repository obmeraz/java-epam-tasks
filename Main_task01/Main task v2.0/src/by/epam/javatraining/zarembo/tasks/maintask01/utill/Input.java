package by.epam.javatraining.zarembo.tasks.maintask01.utill;

import by.epam.javatraining.zarembo.tasks.maintask01.model.Exceptions.VectorIndexOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.UpgradeVector;

import java.io.IOException;

public abstract class Input {
    public abstract void create(UpgradeVector vector) throws VectorIndexOutOfBoundException, IOException;
}
