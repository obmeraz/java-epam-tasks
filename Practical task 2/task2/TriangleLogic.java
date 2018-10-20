package com.company;

public class TriangleLogic {
    public static boolean isOnLine(Point a, Point b, Point c) {
        return (a.getX() - c.getX()) * (b.getY() - c.getY()) == (b.getX() - c.getX()) * (a.getY() - c.getY());
    }

    public static void isTriangle(Point a, Point b, Point c) {
        if (!isOnLine(a, b, c)) {
            Output.print("This is Triangle");
            isRectTriangle(a, b, c);
        } else {
            Output.print("This is not Triangle");
        }
    }

    public static double calculateSide(Point t, Point f) {
        return Math.sqrt(Math.pow((t.getX() - f.getX()), 2) + Math.pow((t.getY() - f.getY()), 2));
    }

    public static void isRectTriangle(Point a, Point b, Point c) {
        double ab = calculateSide(a, b);
        double bc = calculateSide(c, b);
        double ca = calculateSide(a, c);
        if ((ab * ab + bc * bc == ca * ca) || (ab * ab + ca * ca == bc) || (ca * ca + bc * bc == ab)) {
            Output.print("This is Rectangle Triangle");
        } else {
            Output.print("This is not Rectangle Triangle");
        }
    }
}
