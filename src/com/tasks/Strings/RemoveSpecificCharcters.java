package com.tasks.Strings;

public class RemoveSpecificCharcters {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String charactersToRemove = ", !"; // Replace with the characters you want to remove
        String result = removeCharacters(input, charactersToRemove);

        System.out.println("Original string: " + input);
        System.out.println("String after removing specific characters: " + result);
    }

    public static String removeCharacters(String input, String charactersToRemove) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (charactersToRemove.indexOf(c) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }
}

