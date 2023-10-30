package com.tasks.Strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConversion {
    public static void main(String[] args) {
        String dateString = "2023-10-30"; // Replace with your date string
        Date date = convertStringToDate(dateString);

        if (date != null) {
            System.out.println("String: " + dateString);
            System.out.println("Date object: " + date);
        } else {
            System.out.println("Failed to convert the string to a Date.");
        }
    }

    public static Date convertStringToDate(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null; // Parsing failed
        }
    }
}
