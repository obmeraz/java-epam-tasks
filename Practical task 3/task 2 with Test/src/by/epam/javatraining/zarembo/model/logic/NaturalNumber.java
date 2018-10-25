package by.epam.javatraining.zarembo.model.logic;

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

    public static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findNOD(int numOne, int numTwo) {
        while (numOne != 0 && numTwo != 0) {
            if (numOne > numTwo) {
                numOne %= numTwo;
            } else {
                numTwo %= numOne;
            }
        }

        return numOne + numTwo;
    }

    public static int findNOK(int numOne, int numTwo) {
        return (numOne * numTwo) / findNOD(numOne, numTwo);
    }
}
