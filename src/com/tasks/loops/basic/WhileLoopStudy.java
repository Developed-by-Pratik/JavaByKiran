package com.tasks.loops.basic;

public class WhileLoopStudy {

	public static void main(String[] args) {

		int programNumber = 1;

		// Program 1: Print 1 to 25 numbers
		System.out.println("Program " + programNumber + ": Print 1 to 25 numbers");

		int prog1 = 1;
		while (prog1 <= 25) {
			System.out.print(prog1 + " ");
			prog1++;
		}
		
		programNumber++;
		System.out.println("\n");

		// Program 2: Print 25 to 1 numbers
		System.out.println("Program " + programNumber + ": Print 25 to 1 numbers");

		int prog2 = 25;
		while (prog2 >= 1) {
			System.out.print(prog2 + " ");
			prog2--;
		}
		
		programNumber++;
		System.out.println("\n");

		// Program 3: Print 1 to 100 Odd numbers
		System.out.println("Program " + programNumber + ": Print 1 to 100 Odd numbers");

		int prog3 = 1;
		while(prog3 <= 100) {
			if (prog3 % 2 != 0) {
				System.out.print(prog3 + " ");
			}
			prog3++;
		}
		programNumber++;
		System.out.println("\n");

		// Program 4: Print 1 to 100 even numbers

		System.out.println("Program " + programNumber + ": Print 1 to 100 even numbers");
		int prog4 = 1;
		while(prog4 <= 100) {
			if (prog4 % 2 == 0) {
				System.out.print(prog4 + " ");
			}
			prog4++;
		}
		programNumber++;
		System.out.println("\n");

		// Program 5: Sum of 1 to 50 Odd numbers
		System.out.println("Program " + programNumber + ": Sum of 1 to 50 Odd numbers");

		int prog5 = 1;
		int sumOdd = 0;
		while(prog5 <= 50) {
			if (prog5 % 2 != 0) {
				sumOdd += prog5;
			}
			prog5++;
		}
		System.out.println("Sum of odd numbers from 1 to 50: " + sumOdd + "\n");
		programNumber++;
		
		// Program 6: Sum of 1 to 50 EVEN numbers
		System.out.println("Program " + programNumber + ": Sum of 1 to 50 EVEN numbers");

		int sumEven = 0;
		int prog6 = 1;
		while(prog6 <= 50) {
			if (prog6 % 2 == 0) {
				sumEven += prog6;
			}
			prog6++;
		}
		System.out.println("Sum of even numbers from 1 to 50: " + sumEven + "\n");
		programNumber++;
		
		// Program 7: Print -45 to +45 numbers
		System.out.println("Program " + programNumber + ": Print -45 to +45 numbers");

		int prog7 = -45;
		while(prog7 <= 45) {
			System.out.print(prog7 + " ");
			prog7++;
		}
		programNumber++;
		System.out.println("\n");

		// Program 8: Print 50 to 100 numbers
		System.out.println("Program " + programNumber + ": Print 50 to 100 numbers");

		int prog8 = 50;
		while(prog8 <= 100) {
			System.out.print(prog8 + " ");
			prog8++;
		}
		
		programNumber++;
		System.out.println("\n");

		// Program 9: Sum of odd and even numbers from 1 to 100
		System.out.println("Program " + programNumber + ": Sum of odd and even numbers from 1 to 100");

		int sumOddAll = 0;
		int sumEvenAll = 0;

		int prog9 = 50;
		while(prog9 <= 100) {
			if (prog9 % 2 != 0) {
				sumOddAll += prog9;
			} else {
				sumEvenAll += prog9;
			}
			prog9++;
		}
		
		
		System.out.println("Sum of all odd numbers from 1 to 100: " + sumOddAll);
		System.out.println("Sum of all even numbers from 1 to 100: " + sumEvenAll + "\n");
		programNumber++;
		
		// Program 10: Print even and odd numbers from 1 to 100
		System.out.println("Program " + programNumber + ": Print even and odd numbers from 1 to 100");

		System.out.println("Even numbers from 1 to 100:");
		int prog10 = 1;
		while(prog10 <= 100) {
			if (prog10 % 2 == 0) {
				System.out.print(prog10 + " ");
			}
			prog10++;
		}
		
		System.out.println("\n");

		System.out.println("Odd numbers from 1 to 100:");
		int prog111 = 1;
		while(prog111 <= 100) {
			if (prog111 % 2 != 0) {
				System.out.print(prog111 + " ");
			}
			prog111++;
		}
		programNumber++;
		System.out.println("\n");

		// Program 11: Print 1 to 100 numbers
		System.out.println("Program " + programNumber + ": Print 1 to 100 numbers");

		int prog11 = 1;
		while (prog11 <= 100) {
			System.out.print(prog11 + " ");
			prog11++;
		}
		
		programNumber++;
		System.out.println("\n");

		// Program 12: Print 100 to 1 numbers
		System.out.println("Program " + programNumber + ": Print 100 to 1 numbers");

		int prog12 = 100;
		while (prog12 >= 1) {
			System.out.print(prog12 + " ");
			prog12--;
		}
		
		programNumber++;
		System.out.println("\n");

		// Program 13: Print 30 to 50 numbers
		System.out.println("Program " + programNumber + ": Print 30 to 50 numbers");
		
		int prog13 = 30;
		while (prog13 <= 50) {
			System.out.print(prog13 + " ");
			prog13++;
		}
		
		programNumber++;
		System.out.println("\n");

		// Program 14: Count of even numbers from 1 to 25
		System.out.println("Program " + programNumber + ": Count of even numbers from 1 to 25");

		int countEven = 0;

		int prog14 = 1;
		while (prog14 <= 25) {
			if (prog14 % 2 == 0) {
				countEven++;
			}
			prog14++;
		}
		
		System.out.println("Count of even numbers from 1 to 25: " + countEven + "\n");
		programNumber++;
		
		// Program 15: Count of odd numbers from 1 to 25
		System.out.println("Program " + programNumber + ": Count of odd numbers from 1 to 25");

		int countOdd = 0;

		int prog15 = 1;
		while (prog15 <= 25) {
			if (prog15 % 2 != 0) {
				countOdd++;
			}
			prog15++;
		}
		
		System.out.println("Count of odd numbers from 1 to 25: " + countOdd + "\n");
	}
	
}
