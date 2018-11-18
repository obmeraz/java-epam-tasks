package by.epam.javatraining.zarembo.tasks.maintask01.util;

public class FileMatrixCreator {
    public static final int DEFAULT_ROW = 4;
    public static final int DEFAULT_COLUMNS = 4;

    public static double[][] create(String str) {
        String[] parts = str.split(" ");
        double[][] matrix = new double[DEFAULT_ROW][DEFAULT_COLUMNS];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (!parts[i].equals("")) {
                    double result = Double.parseDouble(parts[i]);
                    matrix[i][j] = result;
                }
            }
        }

        return matrix;
    }
}

