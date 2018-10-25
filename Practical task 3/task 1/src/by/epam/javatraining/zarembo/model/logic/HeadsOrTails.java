package by.epam.javatraining.zarembo.model.logic;

import by.epam.javatraining.zarembo.model.entity.RandomNumber;

public class HeadsOrTails {
    public static final int MAX_THROWS = 1000;

    public static int countTailsSides() {
        int tail = 0;
        for (int i = 0; i < MAX_THROWS; i++) {
            if (RandomNumber.generateRandomNumber() == 0) {
                tail++;
            }
        }
        return tail;
    }

    public static int countHeadsSides(int tail) {
        return MAX_THROWS - tail;
    }
}

