package by.epam.pretraining.zarembo.task32;

public class NaturalNumber {
    public static int findLargestDigit(int number) {
        int maxDigit = number % 10;
        while (number > 0) {
            number /= 10;
            if (number % 10 > maxDigit) {
                maxDigit = number % 10;
            }
        }
        return maxDigit;
    }

    public static boolean isPalindrome(int number) {
        int num = number;
        int palindrome = 0;
        while (number > 0) {
            palindrome = palindrome * 10 + number % 10;
            number /= 10;
        }
        return num == palindrome;
    }

    public static boolean isNaturalNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void findNaturalDividers(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0 && isNaturalNumber(i)) {
                System.out.println("Natural divider:" + i);
            }
        }
    }

    public static int findNOD(int numOne, int numTwo) {
        for (int i = 2; i < numOne && i < numTwo; i++) {
            if (numOne % i == 0 && numTwo % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static int findNOK(int numOne, int numTwo) {
        return (numOne * numTwo) / findNOD(numOne, numTwo);
    }

}
