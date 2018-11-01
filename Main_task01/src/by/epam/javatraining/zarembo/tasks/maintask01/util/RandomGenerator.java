package by.epam.javatraining.zarembo.tasks.maintask01.util;


import java.util.Random;

public class RandomGenerator {
    private static Random random = new Random();
    private static final double MIN_RAGE_DOUBLE = -150;
    private static final double MAX_RAGE_DOUBLE = 150;
    private static final int MIN_RAGE_INT = 4;
    private static final int MAX_RAGE_INT = 6;

    public static double generateDoubleRandomNumber() {
        return MIN_RAGE_DOUBLE + (MAX_RAGE_DOUBLE - MIN_RAGE_DOUBLE) * random.nextDouble();
    }

    public static int generateIntRandomNumber() {
        return random.nextInt((MAX_RAGE_INT - MIN_RAGE_INT) + 1) + MIN_RAGE_INT;
    }
}

