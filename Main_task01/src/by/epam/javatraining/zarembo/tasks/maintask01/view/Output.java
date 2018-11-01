package by.epam.javatraining.zarembo.tasks.maintask01.view;

import org.apache.log4j.Logger;

public class Output {
    public static final Logger LOGGER = Logger.getRootLogger();

    public static void loggingData(String value) {
        LOGGER.info("-----------------------------------------------");
        LOGGER.info(value);
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            LOGGER.info("Element of array: " + "[" + i + "]" + array[i]);
        }
    }

    public static void printMatrix(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                LOGGER.info("Element of array: " + "[" + i + "]" + "[" + j + "]" + array[i][j]);
            }
        }
    }

    public static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            LOGGER.info("Element of array: " + "[" + i + "]" + array[i]);
        }
    }
}
