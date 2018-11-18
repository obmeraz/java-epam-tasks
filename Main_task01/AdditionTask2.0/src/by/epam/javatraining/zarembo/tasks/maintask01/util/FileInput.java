package by.epam.javatraining.zarembo.tasks.maintask01.util;

import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.Matrix;

public class FileInput extends Selector {
    @Override
    public void create(Matrix matrix) {
        matrix.setMatrix(FileMatrixCreator.create(FileValidator.valid(FileParser.parse())));
    }
}
