package util;

public class ColorUtil {

    private static final String RESET_COLOR = "\u001B[0m";

    private static final String RED_COLOR = "\u001B[31m";
    private static final String GREEN_COLOR = "\u001B[32m";
    private static final String YELLOW_COLOR = "\u001B[33m";
    private static final String BLUE_COLOR = "\u001B[34m";

    private static final String BLACK_FONT = "\u001B[40m";
    private static final String CURSIVE_FONT = "\u001B[3m";
    private static final String UNDO_CURSIVE_FONT = "\u001B[23m";


    public static String cleanedMessage(String message) {
        return message.replaceAll("\\u001B\\[3[0-7]m|\\u001B\\[4[0-7]m|\\u001B\\[0m", "");
    }

    public static String redColor(String message) {
        return RED_COLOR + message + RESET_COLOR;
    }

    public static String greenColor(String message) {
        return GREEN_COLOR + message + RESET_COLOR;
    }

    public static String yellowColor(String message) {
        return YELLOW_COLOR + message + RESET_COLOR;
    }

    public static String blueColor(String message) {
        return BLUE_COLOR + message + RESET_COLOR;
    }

    public static String blackFont(String message) {
        return BLACK_FONT + message + RESET_COLOR;
    }

    public static String cursiveFont(String message) {
        return CURSIVE_FONT + message + UNDO_CURSIVE_FONT;
    }
}
