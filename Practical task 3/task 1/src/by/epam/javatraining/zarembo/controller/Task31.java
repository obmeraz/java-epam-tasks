package by.epam.javatraining.zarembo.controller;


import by.epam.javatraining.zarembo.model.logic.HeadsOrTails;
import by.epam.javatraining.zarembo.view.Output;

public class Task31 {
    public static void main(String[] args) {
        int tail = HeadsOrTails.countTailsSides();
        int head = HeadsOrTails.countHeadsSides(tail);

        Output.printResults("Tails:", tail);
        Output.printResults("Heads", head);
    }
}
