package com.tasks.Strings;

public class StringReverse {
    public static void main(String[] args) {
        String input = "Hello, World!"; // Replace with your string
        String reversedString = reverseString(input);

        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseString(String input) {
        // Base case: If the string is empty or has only one character, return it as is.
        if (input == null || input.length() <= 1) {
            return input;
        }

        // Recursive case: Reverse the substring from the second character to the end,
        // and concatenate the first character at the end.
        return reverseString(input.substring(1)) + input.charAt(0);
    }
}

