package by.epam.javatraining.zarembo.tasks.maintask01.utill;

import by.epam.javatraining.zarembo.tasks.maintask01.view.Printable;

public class ConsoleOutput implements Printable {


    @Override
    public void print(String str) {
        System.out.println(str);
    }
}
