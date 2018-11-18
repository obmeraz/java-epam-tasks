package by.epam.javatraining.zarembo.tasks.maintask01.utill;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileParser {

    public static StringBuilder parse() {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(
                "D:\\Java\\EPAM\\Main task v2.0\\resources\\vector_elements.txt"))) {
            String tmp = "";
            while ((tmp = br.readLine()) != null) {
                builder.append(tmp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder;
    }
}
