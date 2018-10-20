package com.company;

import java.util.Random;

public class RandomLogic {
    public static int MIN_BOUND = -1;
    public static int MAX_BOUND = 1;

    public static Random random = new Random();

    public static int generateValue() {
        return MIN_BOUND + random.nextInt(MAX_BOUND - MIN_BOUND + 1);
    }
}
