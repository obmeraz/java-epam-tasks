package by.epam.javatraining.zarembo.tasks.maintask01.model.entity;

import by.epam.javatraining.zarembo.tasks.maintask01.model.exception.MatrixOutOfBoundException;

public class Matrix {

    public static final int DEFAULT_SIZE = 3;
    private double[][] matrix;

    //Constructor with no parameters
    public Matrix() {
        matrix = new double[DEFAULT_SIZE][DEFAULT_SIZE];
    }

    //Constructor with one parameter array
    public Matrix(double[][] array) {
        this.matrix = array;
    }

    //Constructor with two parameters, our size of matrix and also checking
    public Matrix(int rowSize, int columnSize) {
        if (rowSize < 1 || columnSize < 1) {
            matrix = new double[DEFAULT_SIZE][DEFAULT_SIZE];
        } else {
            matrix = new double[rowSize][columnSize];
        }
    }

    //return size of out matrix
    public int size() {
        return matrix.length;
    }

    //return size of our index row
    public int sizeWithIndex(int index) {
        return matrix[index].length;
    }

    //return element of matrix with this indexes
    public double get(int rowIndex, int columnIndex) throws MatrixOutOfBoundException {
        if (checkRange(rowIndex, columnIndex)) {
            return matrix[rowIndex][columnIndex];
        } else {
            throw new MatrixOutOfBoundException("Index is out of Bounds");
        }
    }

    //set new value for element with this indexes
    public void set(int rowIndex, int columnIndex, double value) throws MatrixOutOfBoundException {
        if (checkRange(rowIndex, columnIndex)) {
            matrix[rowIndex][columnIndex] = value;
        } else {
            throw new MatrixOutOfBoundException("Index is out of bounds");
        }
    }

    //set new array in our class
    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }

    //return array
    public double[][] getMatrix() {
        return matrix;
    }

    //this method output our matrix in string
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (double[] b : matrix) {
            builder.append("\n");
            for (double c : b) {
                builder.append(c).append(" ");
            }
        }
        return builder.toString();
    }

    //this our checking for right parameters
    private boolean checkRange(int rowIndex, int columnIndex) {
        return rowIndex >= 0 && rowIndex < matrix.length
                && columnIndex >= 0 && columnIndex < matrix[rowIndex].length;

    }
}
