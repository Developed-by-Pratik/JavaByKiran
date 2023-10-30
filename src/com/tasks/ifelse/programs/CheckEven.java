package com.tasks.ifelse.programs;

import java.util.Scanner;

public class CheckEven {

	void CheckEvenOrOdd(int num) {

		if (num % 2 == 0) {
			System.out.println("The number " + num + " is Even !");
		} else {
			System.out.println("The number " + num + " is Not Even !!");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");
		int num = sc.nextInt();

		CheckEven ch = new CheckEven();
		ch.CheckEvenOrOdd(num);

		sc.close();
	}

}
