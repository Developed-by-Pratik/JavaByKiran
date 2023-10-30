package com.tasks.ifelse.programs;

import java.util.Scanner;

public class CheckOdd {
	
	void CheckEvenOrOdd(int num) {

		if (num % 2 != 0) {
			System.out.println("The number " + num + " is Odd !");
		} else {
			System.out.println("The number " + num + " is Not an Odd !!");
		}

	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");
		int num = sc.nextInt();

		CheckOdd ch = new CheckOdd();
		ch.CheckEvenOrOdd(num);

		sc.close();
	}

}
