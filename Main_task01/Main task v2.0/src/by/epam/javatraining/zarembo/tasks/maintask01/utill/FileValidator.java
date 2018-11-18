package by.epam.javatraining.zarembo.tasks.maintask01.utill;

public class FileValidator {

    public static String valid(StringBuilder str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c) || checkDot(str, i, c) || checkMinus(str, i, c)) {
                stringBuilder.append(str.charAt(i));
                if (!Character.isDigit(str.charAt(i + 1)) && str.charAt(i + 1) != '.') {

                    stringBuilder.append(" ");
                }
            }
        }
        str = null;
        return stringBuilder.toString();
    }

    private static Boolean checkDot(StringBuilder str, int i, char c) {
        if ((i == 0 && c == '.')
                || (i == str.length() && c == '.')) {
            return false;
        }
        return c == '.' && Character.isDigit(str.charAt(i - 1))
                && Character.isDigit(str.charAt(i + 1));
    }

    private static Boolean checkMinus(StringBuilder str, int i, char c) {
        if ((i == 0 && c == '-' && !Character.isDigit(str.charAt(i + 1)))
                || (i == str.length() - 1 && c == '-')) {
            return false;
        }
        return c == '-' && Character.isDigit(str.charAt(i + 1));
    }
}