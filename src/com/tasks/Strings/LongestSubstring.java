package com.tasks.Strings;

public class LongestSubstring {
    public static void main(String[] args) {
        String input = "abcabcbb"; // Replace with your string
        String longestSubstring = findLongestSubstring(input);

        System.out.println("Original string: " + input);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
    }

    public static String findLongestSubstring(String input) {
        int n = input.length();
        int maxLength = 0;
        int start = 0;
        int end = 0;
        int left = 0;
        
        while (end < n) {
            char currentChar = input.charAt(end);
            
            int charIndex = input.substring(start, end).indexOf(currentChar);
            
            if (charIndex != -1) {
                left = start + charIndex + 1;
            }
            
            if (end - left + 1 > maxLength) {
                maxLength = end - left + 1;
                start = left;
            }
            
            end++;
        }
        
        return input.substring(start, start + maxLength);
    }
}

