package com.tasks.loops.basic;

public class ForLoopStudy {

	public static void main(String[] args) {

		int programNumber = 1;

		// Program 1: Print 1 to 25 numbers
		System.out.println("Program " + programNumber + ": Print 1 to 25 numbers");

		for (int i = 1; i <= 25; i++) {
			System.out.print(i + " ");
		}
		programNumber++;
		System.out.println("\n");

		// Program 2: Print 25 to 1 numbers
		System.out.println("Program " + programNumber + ": Print 25 to 1 numbers");

		for (int i = 25; i >= 1; i--) {
			System.out.print(i + " ");
		}
		programNumber++;
		System.out.println("\n");

		// Program 3: Print 1 to 100 Odd numbers
		System.out.println("Program " + programNumber + ": Print 1 to 100 Odd numbers");

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		programNumber++;
		System.out.println("\n");

		// Program 4: Print 1 to 100 even numbers

		System.out.println("Program " + programNumber + ": Print 1 to 100 even numbers");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		programNumber++;
		System.out.println("\n");

		// Program 5: Sum of 1 to 50 Odd numbers
		System.out.println("Program " + programNumber + ": Sum of 1 to 50 Odd numbers");

		int sumOdd = 0;
		for (int i = 1; i <= 50; i += 2) {
			sumOdd += i;
		}
		System.out.println("Sum of odd numbers from 1 to 50: " + sumOdd + "\n");
		programNumber++;
		
		// Program 6: Sum of 1 to 50 EVEN numbers
		System.out.println("Program " + programNumber + ": Sum of 1 to 50 EVEN numbers");

		int sumEven = 0;

		for (int i = 2; i <= 50; i += 2) {
			sumEven += i;
		}
		System.out.println("Sum of even numbers from 1 to 50: " + sumEven + "\n");
		programNumber++;
		
		// Program 7: Print -45 to +45 numbers
		System.out.println("Program " + programNumber + ": Print -45 to +45 numbers");

		for (int i = -45; i <= 45; i++) {
			System.out.print(i + " ");
		}
		programNumber++;
		System.out.println("\n");

		// Program 8: Print 50 to 100 numbers
		System.out.println("Program " + programNumber + ": Print 50 to 100 numbers");

		for (int i = 50; i <= 100; i++) {
			System.out.print(i + " ");
		}
		programNumber++;
		System.out.println("\n");

		// Program 9: Sum of odd and even numbers from 1 to 100
		System.out.println("Program " + programNumber + ": Sum of odd and even numbers from 1 to 100");

		int sumOddAll = 0;
		int sumEvenAll = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sumOddAll += i;
			} else {
				sumEvenAll += i;
			}
		}
		System.out.println("Sum of all odd numbers from 1 to 100: " + sumOddAll);
		System.out.println("Sum of all even numbers from 1 to 100: " + sumEvenAll + "\n");
		programNumber++;
		
		// Program 10: Print even and odd numbers from 1 to 100
		System.out.println("Program " + programNumber + ": Print even and odd numbers from 1 to 100");

		System.out.println("Even numbers from 1 to 100:");
		for (int i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
		}
		programNumber++;
		System.out.println("\n");

		System.out.println("Odd numbers from 1 to 100:");
		for (int i = 1; i <= 100; i += 2) {
			System.out.print(i + " ");
		}
		programNumber++;
		System.out.println("\n");

		// Program 11: Print 1 to 100 numbers
		System.out.println("Program " + programNumber + ": Print 1 to 100 numbers");

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		programNumber++;
		System.out.println("\n");

		// Program 12: Print 100 to 1 numbers
		System.out.println("Program " + programNumber + ": Print 100 to 1 numbers");

		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
		programNumber++;
		System.out.println("\n");

		// Program 13: Print 30 to 50 numbers
		System.out.println("Program " + programNumber + ": Print 30 to 50 numbers");

		for (int i = 30; i <= 50; i++) {
			System.out.print(i + " ");
		}
		programNumber++;
		System.out.println("\n");

		// Program 14: Count of even numbers from 1 to 25
		System.out.println("Program " + programNumber + ": Count of even numbers from 1 to 25");

		int countEven = 0;

		for (int i = 1; i <= 25; i++) {
			if (i % 2 == 0) {
				countEven++;
			}
		}
		System.out.println("Count of even numbers from 1 to 25: " + countEven + "\n");
		programNumber++;
		
		// Program 15: Count of odd numbers from 1 to 25
		System.out.println("Program " + programNumber + ": Count of odd numbers from 1 to 25");

		int countOdd = 0;

		for (int i = 1; i <= 25; i++) {
			if (i % 2 != 0) {
				countOdd++;
			}
		}
		System.out.println("Count of odd numbers from 1 to 25: " + countOdd + "\n");
	}
}
