package by.epam.javatraining.zarembo.tasks.maintask01.model.logic;

import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.Matrix;
import by.epam.javatraining.zarembo.tasks.maintask01.model.exception.MatrixOutOfBoundException;

public class LocalFinder {

    //find first local min position in matrix
    public static int[] findFirstLocalMinPos(Matrix matrix) throws MatrixOutOfBoundException {
        int[] position = {-1, -1};
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.sizeWithIndex(i); j++) {
                if (checkLocalMin(matrix, i, j)) {
                    position[0] = i;
                    position[1] = j;
                    return position;
                }
            }
        }
        return position;
    }

    //find first local max position in matrix
    public static int[] findFirstLocalMaxPos(Matrix matrix) throws MatrixOutOfBoundException {
        int[] position = {-1, -1};
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.sizeWithIndex(i); j++) {
                if (checkLocalMax(matrix, i, j)) {
                    position[0] = i;
                    position[1] = j;
                    return position;
                }
            }
        }
        return position;
    }

    private static boolean checkLocalMin(Matrix matrix, int i, int j) throws MatrixOutOfBoundException {
        boolean isMin = false;

        if (i == 0 && j == 0  //first angle element on first row
                && matrix.get(i, j) < matrix.get(i, j + 1)
                && matrix.get(i, j) < matrix.get(i + 1, j)
                && matrix.get(i, j) < matrix.get(i + 1, j + 1)) {
            isMin = true;
        }

        if (i == 0 && j == matrix.sizeWithIndex(i) - 1  //last angle element on first row
                && matrix.get(i, j) < matrix.get(i, j - 1)
                && matrix.get(i, j) < matrix.get(i + 1, j)
                && matrix.get(i, j) < matrix.get(i + 1, j - 1)) {
            isMin = true;
        }

        if (i == matrix.size() - 1 && j == 0 //first angle element on last row
                && matrix.get(i, j) < matrix.get(i, j + 1)
                && matrix.get(i, j) < matrix.get(i - 1, j)
                && matrix.get(i, j) < matrix.get(i - 1, j + 1)) {
            isMin = true;
        }

        if (i == matrix.size() - 1 && j == matrix.sizeWithIndex(i) - 1 //last angle element on last row
                && matrix.get(i, j) < matrix.get(i, j - 1)
                && matrix.get(i, j) < matrix.get(i - 1, j)
                && matrix.get(i, j) < matrix.get(i - 1, j - 1)) {
            isMin = true;
        }

        if (i > 0 && i < matrix.size() - 1 && j == 0 //first element between first and last rows
                && matrix.get(i, j) < matrix.get(i, j + 1)
                && matrix.get(i, j) < matrix.get(i - 1, j)
                && matrix.get(i, j) < matrix.get(i + 1, j)
                && matrix.get(i, j) < matrix.get(i - 1, j + 1)
                && matrix.get(i, j) < matrix.get(i + 1, j + 1)) {
            isMin = true;
        }

        if (i > 0 && i < matrix.size() - 1 && j == matrix.sizeWithIndex(i) - 1 //last element between first and last rows
                && matrix.get(i, j) < matrix.get(i, j - 1)
                && matrix.get(i, j) < matrix.get(i - 1, j)
                && matrix.get(i, j) < matrix.get(i + 1, j)
                && matrix.get(i, j) < matrix.get(i + 1, j - 1)
                && matrix.get(i, j) < matrix.get(i - 1, j - 1)) {
            isMin = true;
        }

        if (i == 0 && j > 0 && j < matrix.sizeWithIndex(i) - 1 //not first and not last element on first row
                && matrix.get(i, j) < matrix.get(i, j - 1)
                && matrix.get(i, j) < matrix.get(i, j + 1)
                && matrix.get(i, j) < matrix.get(i + 1, j)
                && matrix.get(i, j) < matrix.get(i + 1, j - 1)
                && matrix.get(i, j) < matrix.get(i + 1, j + 1)) {
            isMin = true;
        }

        if (i == matrix.size() - 1 && j > 0 && j < matrix.sizeWithIndex(i) - 1 //not first and not last element on last row
                && matrix.get(i, j) < matrix.get(i, j - 1)
                && matrix.get(i, j) < matrix.get(i, j + 1)
                && matrix.get(i, j) < matrix.get(i - 1, j)
                && matrix.get(i, j) < matrix.get(i - 1, j - 1)
                && matrix.get(i, j) < matrix.get(i - 1, j + 1)) {
            isMin = true;
        }

        if (i > 0 && i < matrix.size() - 1 && j > 0 && j < matrix.sizeWithIndex(i) - 1 //just not first or last
                && matrix.get(i, j) < matrix.get(i, j - 1) //element and not on first or last row
                && matrix.get(i, j) < matrix.get(i, j + 1)
                && matrix.get(i, j) < matrix.get(i - 1, j)
                && matrix.get(i, j) < matrix.get(i + 1, j)
                && matrix.get(i, j) < matrix.get(i - 1, j - 1)
                && matrix.get(i, j) < matrix.get(i - 1, j + 1)
                && matrix.get(i, j) < matrix.get(i + 1, j - 1)
                && matrix.get(i, j) < matrix.get(i + 1, j + 1)) {
            isMin = true;

        }
        return isMin;
    }

    private static boolean checkLocalMax(Matrix matrix, int i, int j) throws MatrixOutOfBoundException {
        boolean isMax = false;

        if (i == 0 && j == 0  //first angle element on first row
                && matrix.get(i, j) > matrix.get(i, j + 1)
                && matrix.get(i, j) > matrix.get(i + 1, j)
                && matrix.get(i, j) > matrix.get(i + 1, j + 1)) {
            isMax = true;
        }

        if (i == 0 && j == matrix.sizeWithIndex(i) - 1  //last angle element on first row
                && matrix.get(i, j) > matrix.get(i, j - 1)
                && matrix.get(i, j) > matrix.get(i + 1, j)
                && matrix.get(i, j) > matrix.get(i + 1, j - 1)) {
            isMax = true;
        }

        if (i == matrix.size() - 1 && j == 0 //first angle element on last row
                && matrix.get(i, j) > matrix.get(i, j + 1)
                && matrix.get(i, j) > matrix.get(i - 1, j)
                && matrix.get(i, j) > matrix.get(i - 1, j + 1)) {
            isMax = true;
        }

        if (i == matrix.size() - 1 && j == matrix.sizeWithIndex(i) - 1 //last angle element on last row
                && matrix.get(i, j) > matrix.get(i, j - 1)
                && matrix.get(i, j) > matrix.get(i - 1, j)
                && matrix.get(i, j) > matrix.get(i - 1, j - 1)) {
            isMax = true;
        }

        if (i > 0 && i < matrix.size() - 1 && j == 0 //first element between first and last rows
                && matrix.get(i, j) > matrix.get(i, j + 1)
                && matrix.get(i, j) > matrix.get(i - 1, j)
                && matrix.get(i, j) > matrix.get(i + 1, j)
                && matrix.get(i, j) > matrix.get(i - 1, j + 1)
                && matrix.get(i, j) > matrix.get(i + 1, j + 1)) {
            isMax = true;
        }

        if (i > 0 && i < matrix.size() - 1 && j == matrix.sizeWithIndex(i) - 1 //last element between first and last rows
                && matrix.get(i, j) > matrix.get(i, j - 1)
                && matrix.get(i, j) > matrix.get(i - 1, j)
                && matrix.get(i, j) > matrix.get(i + 1, j)
                && matrix.get(i, j) > matrix.get(i + 1, j - 1)
                && matrix.get(i, j) > matrix.get(i - 1, j - 1)) {
            isMax = true;
        }

        if (i == 0 && j > 0 && j < matrix.sizeWithIndex(i) - 1 //not first and not last element on first row
                && matrix.get(i, j) > matrix.get(i, j - 1)
                && matrix.get(i, j) > matrix.get(i, j + 1)
                && matrix.get(i, j) > matrix.get(i + 1, j)
                && matrix.get(i, j) > matrix.get(i + 1, j - 1)
                && matrix.get(i, j) > matrix.get(i + 1, j + 1)) {
            isMax = true;
        }

        if (i == matrix.size() - 1 && j > 0 && j < matrix.sizeWithIndex(i) - 1 //not first and not last element on last row
                && matrix.get(i, j) > matrix.get(i, j - 1)
                && matrix.get(i, j) > matrix.get(i, j + 1)
                && matrix.get(i, j) > matrix.get(i - 1, j)
                && matrix.get(i, j) > matrix.get(i - 1, j - 1)
                && matrix.get(i, j) > matrix.get(i - 1, j + 1)) {
            isMax = true;
        }

        if (i > 0 && i < matrix.size() - 1 && j > 0 && j < matrix.sizeWithIndex(i) - 1 //just not first or last
                && matrix.get(i, j) > matrix.get(i, j - 1) //element and not on first or last row
                && matrix.get(i, j) > matrix.get(i, j + 1)
                && matrix.get(i, j) > matrix.get(i - 1, j)
                && matrix.get(i, j) > matrix.get(i + 1, j)
                && matrix.get(i, j) > matrix.get(i - 1, j - 1)
                && matrix.get(i, j) > matrix.get(i - 1, j + 1)
                && matrix.get(i, j) > matrix.get(i + 1, j - 1)
                && matrix.get(i, j) > matrix.get(i + 1, j + 1)) {
            isMax = true;

        }
        return isMax;
    }
}
