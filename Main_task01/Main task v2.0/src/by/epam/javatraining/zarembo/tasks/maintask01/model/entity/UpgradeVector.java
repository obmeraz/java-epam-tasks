package by.epam.javatraining.zarembo.tasks.maintask01.model.entity;

import by.epam.javatraining.zarembo.tasks.maintask01.model.exceptions.VectorIndexOutOfBoundException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.exceptions.VectorIsFullException;

public class UpgradeVector {
    public static final int DEFAULT_SIZE = 10;
    private double[] vector;
    private int count;

    //constructor with no parameters
    public UpgradeVector() {
        vector = new double[DEFAULT_SIZE];
        count = 0;
    }

    //constructor with one param array
    public UpgradeVector(double[] array) {
        this.vector = array;
        count = array.length;
    }

    //constructor with number which define the size of our vector and also checking on right size
    public UpgradeVector(int size) {
        if (size < 0) {
            vector = new double[DEFAULT_SIZE];
            count = 0;
        } else {
            vector = new double[size];
            count = 0;
        }
    }

    public UpgradeVector(UpgradeVector vector) throws VectorIndexOutOfBoundException {
        this.vector = new double[vector.size()];
        this.count = vector.getCount();
        for (int i = 0; i < vector.size(); i++) {
            this.vector[i] = vector.get(i);
        }
    }

    //set new array
    public void setVector(double[] vector) {
        this.vector = vector;
        count = vector.length;
    }

    //get our vector
    public double[] getVector() {
        return vector;
    }

    //return size of out vector
    public int size() {
        return vector.length;
    }

    //return the element with this index of vector, and checking range
    public double get(int index) throws VectorIndexOutOfBoundException {
        if (checkRange(index)) {
            return vector[index];

        } else {
            throw new VectorIndexOutOfBoundException("Index is out of bounds");
        }
    }

    //set the new element with this index and checking range
    public void set(int index, double value) throws VectorIndexOutOfBoundException {
        if (checkRange(index)) {
            vector[index] = value;
        } else {
            throw new VectorIndexOutOfBoundException("Index is out of bounds");
        }
    }

    public void add(double value) throws VectorIsFullException {
        if (count == vector.length) {
            throw new VectorIsFullException();
        }
        vector[count++] = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    //return out vector in string
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        for (double b : vector) {
            builder.append(b).append(" ");

        }
        builder.append("]");
        return builder.toString();
    }

    //this method check right range of vector
    private boolean checkRange(int index) {
        return index < vector.length && index >= 0;
    }
}



