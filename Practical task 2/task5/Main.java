package com.company;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        date.setDay(UserInput.inputValue());
        date.setMonth(UserInput.inputValue());
        date.setYear(UserInput.inputValue());
        NextDayLogic.calculateNextDay(date);
    }
}


