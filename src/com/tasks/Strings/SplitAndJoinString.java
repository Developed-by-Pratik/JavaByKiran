package com.tasks.Strings;

import java.util.Scanner;

public class SplitAndJoinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        String[] words = splitString(input);
        String joinedString = joinString(words, " "); // You can change the delimiter here

        System.out.println("Original string: " + input);
        System.out.println("Words: " + String.join(", ", words));
        System.out.println("Joined string: " + joinedString);
    }

    public static String[] splitString(String input) {
        return input.split("\\s+"); // Split by whitespace
    }

    public static String joinString(String[] words, String delimiter) {
        return String.join(delimiter, words);
    }
}

