package by.epam.javatraining.zarembo.tasks.maintask01.util;

import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.Matrix;
import by.epam.javatraining.zarembo.tasks.maintask01.model.exception.MatrixOutOfBoundException;

public abstract class Selector {
    public abstract void create(Matrix matrix) throws MatrixOutOfBoundException;
}

