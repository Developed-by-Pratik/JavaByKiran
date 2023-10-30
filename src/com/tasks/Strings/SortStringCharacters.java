package com.tasks.Strings;

import java.util.Arrays;

public class SortStringCharacters {
    public static void main(String[] args) {
        String input = "programming"; // Replace with your string
        String sortedString = sortCharacters(input);

        System.out.println("Original string: " + input);
        System.out.println("Sorted string: " + sortedString);
    }

    public static String sortCharacters(String input) {
        char[] charArray = input.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);

        // Create a new string from the sorted character array
        return new String(charArray);
    }
}

