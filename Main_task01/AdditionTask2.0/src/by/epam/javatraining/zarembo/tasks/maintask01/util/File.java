package by.epam.javatraining.zarembo.tasks.maintask01.util;

import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.Matrix;
import by.epam.javatraining.zarembo.tasks.maintask01.model.exception.MatrixOutOfBoundException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class File {

    public static void fillMatrix(Matrix matrix) throws FileNotFoundException, MatrixOutOfBoundException {
        FileReader fileReader =
                new FileReader("D:\\Java\\EPAM\\AdditionTask2.0\\resources\\matrix_elements.txt");
        Scanner scanner = new Scanner(fileReader);
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.sizeWithIndex(i); j++) {
                matrix.set(i, j, scanner.nextDouble());
            }
        }
    }
}
