package com.tasks.ifelse.programs;

import java.util.Scanner;

public class SumOfEven {

	void SumOfEvenNum(int num1, int num2) {

		if (num1 % 2 == 0 && num2 % 2 == 0) {
			int sum = num1 + num2;
			System.out.println("The sum of " + num1 + " and " + num2 + " is :" + sum);
		} else {
			System.out.println("sorry!!");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st Num :");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd Num :");
		int num2 = sc.nextInt();

		SumOfEven s = new SumOfEven();
		s.SumOfEvenNum(num1, num2);

		sc.close();

	}

}
