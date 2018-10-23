package by.epam.pretraining.zarembo.task31;

import java.util.Random;

public class RandomNumber {
    private static Random random = new Random();

    public static int generateRandomNumber() {
        return random.nextInt(2);
    }
}
