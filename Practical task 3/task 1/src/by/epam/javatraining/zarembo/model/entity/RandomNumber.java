package by.epam.javatraining.zarembo.model.entity;

import java.util.Random;

public class RandomNumber {
    private static Random random = new Random();

    public static int generateRandomNumber() {
        return random.nextInt(2);
    }
}

