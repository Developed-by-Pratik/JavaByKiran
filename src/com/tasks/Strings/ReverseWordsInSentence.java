package com.tasks.Strings;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String sentence = "Hello, World!"; // Replace with your sentence
        String reversedSentence = reverseWords(sentence);

        System.out.println("Original sentence: " + sentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }

    public static String reverseWords(String sentence) {
        // Split the sentence into words using whitespace as the delimiter
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();

        // Iterate through the words in reverse order and construct the reversed sentence
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }

        return reversedSentence.toString();
    }
}

