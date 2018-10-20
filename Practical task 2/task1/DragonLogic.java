package com.company;

public class DragonLogic {
    public static final int TWO_HUNDRED_YEARS = 200;
    public static final int THREE_HUNDRED_YEARS = 300;

    public static final int START_HEADS = 3;

    public static final int EYES_NUMBER = 2;

    public static int calculateHeads(int age) {
        if (age < TWO_HUNDRED_YEARS) {
            return age * 3 + START_HEADS;
        } else if (age > TWO_HUNDRED_YEARS && age < THREE_HUNDRED_YEARS) {
            age -= TWO_HUNDRED_YEARS;
            return age * 2 + 600 + START_HEADS;
        } else {
            age -= THREE_HUNDRED_YEARS;
            return age + 600 + 200 + START_HEADS;
        }
    }

    public static int calculateEyes(int heads) {
        return heads * EYES_NUMBER;
    }
}
