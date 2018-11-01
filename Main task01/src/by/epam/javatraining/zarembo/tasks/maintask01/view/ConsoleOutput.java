package by.epam.javatraining.zarembo.tasks.maintask01.view;

public class ConsoleOutput {

    public static void printArrayToConsole(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element of array: " + "[" + i + "]" + array[i]);
        }
    }

    public static void printMatrixToConsole(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Element of array: " + "[" + i + "]" + "[" + j + "]" + array[i][j]);
            }
        }
    }

    public static void printConsole(String str) {
        System.out.println(str);
    }
}
