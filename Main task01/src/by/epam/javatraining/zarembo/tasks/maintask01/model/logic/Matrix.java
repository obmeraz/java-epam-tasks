package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.view.Output;

public class Matrix {

    //This method find max element in matrix
    public static double findMaxElement(double[][] array) {
        double maxElement = array[0][0];
        for (double[] anArray : array) {
            for (double anAnArray : anArray) {
                if (anAnArray > maxElement) {
                    maxElement = anAnArray;
                }
            }
        }
        return maxElement;
    }

    //This method find min element in matrix
    public static double findMinElement(double[][] array) {
        double minElement = array[0][0];
        for (double[] anArray : array) {
            for (double anAnArray : anArray) {
                if (anAnArray < minElement) {
                    minElement = anAnArray;
                }
            }
        }
        return minElement;
    }

    //This method find average arithmetic in matrix
    public static double findAverageArithmetic(double[][] array) {
        double sum = 0;
        for (double[] anArray : array) {
            for (double anAnArray : anArray) {
                sum += anAnArray;
            }
        }
        return sum / (array.length * array[0].length);
    }

    //This method find average geometric in matrix
    public static double findAverageGeometric(double[][] array) {
        double multiplying = 1;
        for (double[] anArray : array) {
            for (double anAnArray : anArray) {
                multiplying *= anAnArray;
            }
        }
        return Math.pow(multiplying, 1.0 / (array.length * array[0].length));
    }

    //This method define is matrix symmetric on main diagonal
    public static boolean isSymmetricMainDiagonal(double[][] array) {
        if (array[0].length != array.length) {
            Output.loggingData("Matrix must be quadratic!");
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != array[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    //This method define is matrix symmetric on second diagonal
    public static boolean isSymmetricSecondDiagonal(double[][] array) {
        if (array[0].length != array.length) {
            Output.loggingData("Matrix must be quadratic!");
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != array[array.length - 1 - j][array.length - 1 - i]) {
                    return false;
                }
            }
        }
        return true;
    }

    //This method find the position of the first local min element, all if construction check different situations:
    //when element is located at first position,or on the corner of matrix,or the last,and also check neighbors
    //diagonal
    public static int[] findFirstLocalMinPosition(double[][] array) {
        int[] position = {-1, -1};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 && j == 0) {
                    if (array[i][j] < array[i][j + 1]
                            && array[i][j] < array[i + 1][j] && array[i][j] < array[i + 1][j + 1]) {
                        position[0] = i;
                        position[1] = j;
                        return position;
                    }
                } else if (i == 0 && j == array[i].length - 1) {
                    if (array[i][j] < array[i][j - 1]
                            && array[i][j] < array[i + 1][j] && array[i][j] < array[i + 1][j - 1]) {
                        position[0] = i;
                        position[1] = j;
                        return position;
                    }
                } else if (i == array.length - 1 && j == 0) {
                    if (array[i][j] < array[i][j + 1]
                            && array[i][j] < array[i - 1][j] && array[i][j] < array[i - 1][j + 1]) {
                        position[0] = i;
                        position[1] = j;
                        return position;
                    }
                } else if (i == array.length - 1 && j == array[i].length - 1) {
                    if (array[i][j] < array[i][j - 1]
                            && array[i][j] < array[i - 1][j] && array[i][j] < array[i - 1][j - 1]) {
                        position[0] = i;
                        position[1] = j;
                        return position;
                    }
                }
                if (i == 0 && j > 0 && j < array[i].length - 1) {
                    if (array[i][j] < array[i][j - 1] && array[i][j] < array[i][j + 1]
                            && array[i][j] < array[i + 1][j] && array[i][j] < array[i + 1][j + 1]
                            && array[i][j] < array[i + 1][j - 1]) {
                        position[0] = i;
                        position[1] = j;
                        return position;
                    }
                } else if (i == array.length - 1 && j > 0) {
                    if (array[i][j] < array[i][j - 1] && array[i][j] < array[i][j + 1]
                            && array[i][j] < array[i - 1][j] && array[i][j] < array[i - 1][j + 1]
                            && array[i][j] < array[i - 1][j - 1]) {
                        position[0] = i;
                        position[1] = j;
                        return position;
                    }
                } else if (j > 0 && j < array[i].length - 1 && i > 0 && i < array.length - 1) {
                    if (array[i][j] < array[i][j - 1] && array[i][j] < array[i][j + 1]
                            && array[i][j] < array[i - 1][j] && array[i][j] < array[i - 1][j + 1]
                            && array[i][j] < array[i - 1][j - 1]
                            && array[i][j] < array[i + 1][j]
                            && array[i][j] < array[i + 1][j + 1]
                            && array[i][j] < array[i + 1][j - 1]) {
                        position[0] = i;
                        position[1] = j;
                        return position;
                    }
                }
            }
        }
        return position;
    }

    //This method find the position of the first local max element, all if construction check different situations:
    //when element is located at first position,or on the corner of matrix,or the last,and also check neighbors
    //diagonal
    public static int[] findFirstLocalMaxPosition(double[][] array) {
        int[] position = {-1, -1};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 && j == 0) {
                    if (array[i][j] > array[i][j + 1]
                            && array[i][j] > array[i + 1][j] && array[i][j] > array[i + 1][j + 1]) {
                        position[0] = i;
                        position[1] = j;
                        return position;
                    }
                } else if (i == 0 && j == array[i].length - 1) {
                    if (array[i][j] > array[i][j - 1]
                            && array[i][j] > array[i + 1][j] && array[i][j] > array[i + 1][j - 1]) {
                        position[0] = i;
                        position[1] = j;
                        return position;
                    }
                } else if (i == array.length - 1 && j == 0) {
                    if (array[i][j] > array[i][j + 1]
                            && array[i][j] > array[i - 1][j] && array[i][j] > array[i - 1][j + 1]) {
                        position[0] = i;
                        position[1] = j;
                        return position;
                    }
                } else if (i == array.length - 1 && j == array[i].length - 1) {
                    if (array[i][j] > array[i][j - 1]
                            && array[i][j] > array[i - 1][j] && array[i][j] > array[i - 1][j - 1]) {
                        position[0] = i;
                        position[1] = j;
                        return position;
                    }
                }
                if (i == 0 && j > 0 && j < array[i].length - 1) {
                    if (array[i][j] > array[i][j - 1] && array[i][j] > array[i][j + 1]
                            && array[i][j] > array[i + 1][j] && array[i][j] > array[i + 1][j + 1]
                            && array[i][j] > array[i + 1][j - 1]) {
                        position[0] = i;
                        position[1] = j;
                        return position;
                    }
                } else if (i == array.length - 1 && j > 0) {
                    if (array[i][j] > array[i][j - 1] && array[i][j] > array[i][j + 1]
                            && array[i][j] > array[i - 1][j] && array[i][j] > array[i - 1][j + 1]
                            && array[i][j] > array[i - 1][j - 1]) {
                        position[0] = i;
                        position[1] = j;
                        return position;
                    }
                } else if (j > 0 && j < array[i].length - 1 && i > 0 && i < array.length - 1) {
                    if (array[i][j] > array[i][j - 1] && array[i][j] > array[i][j + 1]
                            && array[i][j] > array[i - 1][j] && array[i][j] > array[i - 1][j + 1]
                            && array[i][j] > array[i - 1][j - 1]
                            && array[i][j] > array[i + 1][j]
                            && array[i][j] > array[i + 1][j + 1]
                            && array[i][j] > array[i + 1][j - 1]) {
                        position[0] = i;
                        position[1] = j;
                        return position;
                    }
                }
            }
        }
        return position;
    }

    //This method transpose matrix without addition memory
    public static void transposeMatrix(double[][] array) {
        if (array[0].length != array.length) {
            Output.loggingData("Matrix must be quadratic!");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                array[i][j] += array[j][i];
                array[j][i] = array[i][j] - array[j][i];
                array[i][j] -= array[j][i];
            }
        }
    }
}



