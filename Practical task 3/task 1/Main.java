package by.epam.pretraining.zarembo.task31;

public class Main {

    public static void main(String[] args) {
        int tail = HeadsOrTails.countTailsSides();
        int head = HeadsOrTails.countHeadsSides(tail);

        Output.printResults("Tails:", tail);
        Output.printResults("Heads", head);
    }
}
