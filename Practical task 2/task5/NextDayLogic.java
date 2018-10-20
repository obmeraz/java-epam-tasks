package com.company;

public class NextDayLogic {
    public static final int DIVISIBLE_FOUR = 4;
    public static final int DIVISIBLE_ONE_HUNDRED = 100;
    public static final int DIVISIBLE_FOUR_HUNDRED = 400;

    public static final int FEBRUARY = 2;
    public static final int LEAP_MAX_DAY_FEBRUARY = 29;
    public static final int MAX_DAY_FEBRUARY = 28;

    public static final int APRIL = 4;
    public static final int JUNE = 6;
    public static final int SEPTEMBER = 9;
    public static final int NOVEMBER = 11;
    public static final int DECEMBER = 12;
    public static final int MAX_DAY_IN_THIRTHY_DAY_MONTHS = 30;
    public static final int MAX_DAY_IN_THIRTHY_ONE_DAY_MONTHS = 31;


    public static boolean isLeapYear(int year) {
        if (year % DIVISIBLE_FOUR == 0 && year % DIVISIBLE_ONE_HUNDRED == 0 && year % DIVISIBLE_FOUR_HUNDRED == 0) {
            return true;
        }
        if (year % DIVISIBLE_FOUR == 0 && year % DIVISIBLE_ONE_HUNDRED == 0) {
            return false;
        }
        if (year % DIVISIBLE_FOUR == 0) {
            return true;
        }

        return false;
    }

    public static void calculateNextDay(Date date) {
        Date newDate = new Date();
        if (isLeapYear(date.getYear())) {
            if (date.getMonth() == FEBRUARY) {
                if (date.getDay() == LEAP_MAX_DAY_FEBRUARY) {
                    newDate.setDay(1);
                    newDate.setMonth(date.getMonth() + 1);
                    newDate.setYear(date.getYear());
                } else {
                    newDate.setDay(date.getDay() + 1);
                    newDate.setMonth(date.getMonth());
                    newDate.setYear(date.getYear());
                }
            } else if (date.getMonth() == APRIL || date.getMonth() == JUNE || date.getMonth() == SEPTEMBER
                    || date.getMonth() == NOVEMBER) {
                if (date.getDay() == MAX_DAY_IN_THIRTHY_DAY_MONTHS) {
                    newDate.setDay(1);
                    newDate.setMonth(date.getMonth() + 1);
                    newDate.setYear(date.getYear());
                } else {
                    newDate.setDay(date.getDay() + 1);
                    newDate.setMonth(date.getMonth());
                    newDate.setYear(date.getYear());
                }
            } else if (date.getMonth() == DECEMBER && date.getDay() == MAX_DAY_IN_THIRTHY_ONE_DAY_MONTHS) {
                newDate.setDay(1);
                newDate.setMonth(1);
                newDate.setYear(date.getYear() + 1);
            } else if (date.getDay() == MAX_DAY_IN_THIRTHY_ONE_DAY_MONTHS) {
                newDate.setDay(1);
                newDate.setMonth(date.getMonth() + 1);
                newDate.setYear(date.getYear());
            } else {
                newDate.setDay(date.getDay() + 1);
                newDate.setMonth(date.getMonth());
                newDate.setYear(date.getYear());
            }
        } else {
            if (date.getMonth() == FEBRUARY) {
                if (date.getDay() == MAX_DAY_FEBRUARY) {
                    newDate.setDay(1);
                    newDate.setMonth(date.getMonth() + 1);
                    newDate.setYear(date.getYear());
                } else {
                    newDate.setDay(date.getDay() + 1);
                    newDate.setMonth(date.getMonth());
                    newDate.setYear(date.getYear());
                }
            } else if (date.getMonth() == APRIL || date.getMonth() == JUNE || date.getMonth() == SEPTEMBER
                    || date.getMonth() == NOVEMBER) {
                if (date.getDay() == MAX_DAY_IN_THIRTHY_DAY_MONTHS) {
                    newDate.setDay(1);
                    newDate.setMonth(date.getMonth() + 1);
                    newDate.setYear(date.getYear());
                } else {
                    newDate.setDay(date.getDay() + 1);
                    newDate.setMonth(date.getMonth());
                    newDate.setYear(date.getYear());
                }
            } else if (date.getMonth() == DECEMBER && date.getDay() == MAX_DAY_IN_THIRTHY_ONE_DAY_MONTHS) {
                newDate.setDay(1);
                newDate.setMonth(1);
                newDate.setYear(date.getYear() + 1);
            } else if (date.getDay() == MAX_DAY_IN_THIRTHY_ONE_DAY_MONTHS) {
                newDate.setDay(1);
                newDate.setMonth(date.getMonth() + 1);
                newDate.setYear(date.getYear());
            } else {
                newDate.setDay(date.getDay() + 1);
                newDate.setMonth(date.getMonth());
                newDate.setYear(date.getYear());
            }
        }
        Output.print(newDate.getDay(), newDate.getMonth(), newDate.getYear());
    }
}
