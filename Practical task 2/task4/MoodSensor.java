package com.company;

public class MoodSensor {
    public static void defineMood() {
        int number = RandomLogic.generateValue();
        if (number < 0) {
            Output.print("User has a bad mood");
        } else if (number > 0) {
            Output.print("User has a good mood");
        } else {
            Output.print("User has a middle between good and bad mood");
        }
    }
}
