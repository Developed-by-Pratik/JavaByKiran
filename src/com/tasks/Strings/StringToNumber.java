package com.tasks.Strings;

public class StringToNumber {
    public static void main(String[] args) {
        String numberString = "42"; // Replace with your number as a string
        int intValue = stringToInt(numberString);
        double doubleValue = stringToDouble(numberString);

        System.out.println("Number as a string: " + numberString);
        System.out.println("As an integer: " + intValue);
        System.out.println("As a double: " + doubleValue);
    }

    public static int stringToInt(String numberString) {
        try {
            return Integer.parseInt(numberString);
        } catch (NumberFormatException e) {
            // Handle parsing error
            return 0; // Default value if parsing fails
        }
    }

    public static double stringToDouble(String numberString) {
        try {
            return Double.parseDouble(numberString);
        } catch (NumberFormatException e) {
            // Handle parsing error
            return 0.0; // Default value if parsing fails
        }
    }
}

