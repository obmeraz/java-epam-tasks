package by.epam.javatraining.zarembo.tasks.maintask01.utill;

import by.epam.javatraining.zarembo.tasks.maintask01.model.entity.UpgradeVector;
import by.epam.javatraining.zarembo.tasks.maintask01.view.Printable;

import java.io.*;

public class FileOutput implements Printable {

    public void print(String str) {
        File f = new File("res.txt");
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f, true)))) {
            pw.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
