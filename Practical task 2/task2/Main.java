package com.company;


public class Main {

    public static void main(String[] args) {
        Point a = new Point();
        Point b = new Point();
        Point c = new Point();
        a.setX(UserInput.inputValue());
        a.setY(UserInput.inputValue());
        b.setX(UserInput.inputValue());
        b.setY(UserInput.inputValue());
        c.setX(UserInput.inputValue());
        c.setY(UserInput.inputValue());
        TriangleLogic.isTriangle(a, b, c);
    }
}
