package by.epam.javatraining.zarembo.tasks.maintask01.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RandomValue {
    private static Random random = new Random();
    private static final double MIN_RAGE_DOUBLE = -150;
    private static final double MAX_RAGE_DOUBLE = 150;

    public static double generateDoubleValue() {
        Double b = MIN_RAGE_DOUBLE + (MAX_RAGE_DOUBLE - MIN_RAGE_DOUBLE) * random.nextDouble();
        b = BigDecimal.valueOf(b).setScale(3, RoundingMode.HALF_UP).doubleValue();
        return b;
    }
}

