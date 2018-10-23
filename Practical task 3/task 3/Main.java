package by.epam.pretraining.zarembo.task33;

public class Main {

    public static void main(String[] args) {
        int number = UserInput.inputValue();
        Output.print(PerfectNumber.isPerfectNumber(number));
    }
}
