package by.epam.javatraining.zarembo.tasks.maintask01.util;

import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.Matrix;
import by.epam.javatraining.zarembo.tasks.maintask01.model.exception.MatrixOutOfBoundException;

public class HardCode extends Selector {

    public void create(Matrix matrix) throws MatrixOutOfBoundException {
        for (int i=0;i<matrix.size();i++){
            for (int j=0;j<matrix.sizeWithIndex(i);j++){
                matrix.set(i,j,i+11);
            }
        }
    }
}
