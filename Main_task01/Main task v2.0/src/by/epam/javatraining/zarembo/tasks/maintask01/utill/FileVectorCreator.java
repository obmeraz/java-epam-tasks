package by.epam.javatraining.zarembo.tasks.maintask01.utill;


public class FileVectorCreator {

    public static double[] create(String str) {
        String[] parts = str.split(" ");
        int k = 0;
        double[] vector = new double[parts.length];
        for (String part : parts) {
            if (!part.equals("")) {
                double result = Double.parseDouble(part);
                vector[k] = result;
                k++;
            }
        }
        return vector;
    }
}
