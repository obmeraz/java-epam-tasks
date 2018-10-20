package com.company;

public class DragonLogic {
    public static final int TWO_HUNDRED_YEARS = 200;
    public static final int THREE_HUNDRED_YEARS = 300;

    public static final int TWO_HUNDRED_YEARS_HEADS = 600;
    public static final int ONE_HUNDRED_YEARS_HEADS = 200;

    public static final int EYES_NUMBER = 200;

    public static int calculateHeads(int age) {
        if (age < TWO_HUNDRED_YEARS) {
            return age * 3;
        } else if (age > TWO_HUNDRED_YEARS && age < THREE_HUNDRED_YEARS) {
            age -= TWO_HUNDRED_YEARS;
            return age * 2 + TWO_HUNDRED_YEARS_HEADS;
        } else {
            age -= THREE_HUNDRED_YEARS;
            return age + TWO_HUNDRED_YEARS_HEADS + ONE_HUNDRED_YEARS_HEADS;
        }
    }

    public static int calculateEyes(int heads) {
        return heads * EYES_NUMBER;
    }
}
