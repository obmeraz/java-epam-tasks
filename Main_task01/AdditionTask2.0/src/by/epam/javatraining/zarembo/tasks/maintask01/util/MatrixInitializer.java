package by.epam.javatraining.zarembo.tasks.maintask01.util;

import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.Matrix;
import by.epam.javatraining.zarembo.tasks.maintask01.model.exception.MatrixOutOfBoundException;


import java.io.FileNotFoundException;

public class MatrixInitializer {

    public static void initialize(Selector selector,Matrix matrix) throws MatrixOutOfBoundException {
        selector.create(matrix);
    }
}
