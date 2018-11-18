package by.epam.javatraining.zarembo.tasks.maintask01.view;

import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.Matrix;
import org.apache.log4j.Logger;

public class Output {

    public static final Logger LOG=Logger.getRootLogger();

    public static void printMatrix(Matrix matrix){
        LOG.info(matrix.toString());
    }

    public static void logInformation(String str){
        LOG.info(str);
    }

    public static void printArray(int[] position){
        LOG.info(position[0]);
        LOG.info(position[1]);
    }
}
