package by.epam.javatraining.zarembo.tasks.maintask01.util;

import java.io.FileNotFoundException;
import java.io.FileReader;


import java.util.Scanner;

public class File {

    public static double[] fillArray() throws FileNotFoundException {
        double[] array = new double[10];
        FileReader fileReader = new FileReader("D:\\Java\\EPAM\\Main task 1\\resources\\array_elements.txt");
        Scanner scanner = new Scanner(fileReader);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }
        return array;
    }

    public static double[][] fillMatrix() throws FileNotFoundException {
        double[][] array = new double[3][3];
        FileReader fileReader = new FileReader("D:\\Java\\EPAM\\Main task 1\\resources\\matrix_elements.txt");
        Scanner scanner = new Scanner(fileReader);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }
        return array;
    }
}
