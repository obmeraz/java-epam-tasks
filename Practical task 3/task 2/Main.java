package by.epam.pretraining.zarembo.task32;


public class Main {

    public static void main(String[] args) {
        int numberOne = UserInput.inputValue();
        int numberTwo = UserInput.inputValue();

        NaturalNumber.findNaturalDividers(numberOne);
        Output.print(NaturalNumber.findLargestDigit(numberOne));
        Output.printBoolean(NaturalNumber.isPalindrome(numberTwo));
        Output.print(NaturalNumber.findNOK(numberOne, numberTwo));
        Output.print(NaturalNumber.findNOD(numberOne, numberTwo));
        Output.printBoolean(NaturalNumber.isNaturalNumber(numberOne));
    }
}
