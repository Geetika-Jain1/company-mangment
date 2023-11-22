package org.example;

public class Utilities {
    public static boolean numberIsOdd(int number) {
        return number % 2 != 0;
    }
    public static boolean stringIsBlank(String input) {
        return input == null || input.trim().isEmpty();
    }

    public static Level getNoiseLevel(int decibel) {
        if (decibel <= 30) {
            return Level.Low;
        } else if (decibel >= 70) {
            return Level.High;
        } else {
            return Level.Medium;
        }

    }
    public static String makeStringLowercase(String input){
        var output = input.toLowerCase();
        return output;
    }

    public enum Level {

            Low,
            Medium,
            High,
        }
}
