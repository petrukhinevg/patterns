package util;

public class ColorUtil {

    public static String resetColor = "\u001B[0m";

    public static String redColor = "\u001B[31m";
    public static String greenColor = "\u001B[32m";
    public static String yellowColor = "\u001B[33m";
    public static String blueColor = "\u001B[34m";

    public static String blackFont = "\u001B[40m";
    public static String cursiveFont = "\u001B[3m";
    public static String undoCursiveFont = "\u001B[23m";


    public static String cleanedMessage(String message) {
        return message.replaceAll("\\u001B\\[3[0-7]m|\\u001B\\[4[0-7]m|\\u001B\\[0m", "");
    }


}
