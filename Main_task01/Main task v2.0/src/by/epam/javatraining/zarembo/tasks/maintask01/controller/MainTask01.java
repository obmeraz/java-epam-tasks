package by.epam.javatraining.zarembo.tasks.maintask01.controller;

import by.epam.javatraining.zarembo.tasks.maintask01.model.Exceptions.UpgradeVectorException;
import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.UpgradeVector;
import by.epam.javatraining.zarembo.tasks.maintask01.model.logic.AscSorter;
import by.epam.javatraining.zarembo.tasks.maintask01.model.logic.AverageFinder;
import by.epam.javatraining.zarembo.tasks.maintask01.model.logic.ElementsReverser;
import by.epam.javatraining.zarembo.tasks.maintask01.model.logic.ExtremerFinder;
import by.epam.javatraining.zarembo.tasks.maintask01.utill.*;
import by.epam.javatraining.zarembo.tasks.maintask01.view.Printable;

import java.io.IOException;

public class MainTask01 {

    public static void main(String[] args) {
        try {
            UpgradeVector vector2 = new UpgradeVector();
            UpgradeVector vector = new UpgradeVector();
            UpgradeVector vector3 = new UpgradeVector();

            Input input = new RandomInput();
            Input input2 = new FileInput();
            Input input3 = new HardCodeInput();

            UpgradeVectorInitializer.initialize(input, vector);
            UpgradeVectorInitializer.initialize(input2, vector2);
            UpgradeVectorInitializer.initialize(input3, vector3);

            Printable logOutput = new PrinterCreator().create(PrintType.LOG);

            logOutput.print(vector.toString());
            logOutput.print("Max value:" + ExtremerFinder.findMaxValue(vector));
            logOutput.print("Min value:" + ExtremerFinder.findMinValue(vector));
            logOutput.print("Average arithmetic:" + AverageFinder.findAverageArithmetic(vector));
            logOutput.print("Average geometric:" + AverageFinder.findAverageGeometric(vector));

            ElementsReverser.reverseElements(vector);

            logOutput.print(vector.toString());

            AscSorter.sortWithQuickSort(vector);

            logOutput.print(vector.toString());

        } catch (UpgradeVectorException | IOException e) {
            e.printStackTrace();
        }
    }
}
