package com.tasks.Strings;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String input = sc.nextLine();
        sc.close();

        String reversedString = reverseWords(input);
        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder reversed = new StringBuilder();
        StringBuilder word = new StringBuilder();
        boolean wordFound = false;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isWhitespace(c)) {
                if (wordFound) {
                    reversed.insert(0, word.toString());
                    wordFound = false;
                    word.setLength(0);
                }
                reversed.insert(0, c);
            } else {
                wordFound = true;
                word.append(c);
            }
        }

        if (wordFound) {
            reversed.insert(0, word.toString());
        }

        return reversed.toString();
    }
}

