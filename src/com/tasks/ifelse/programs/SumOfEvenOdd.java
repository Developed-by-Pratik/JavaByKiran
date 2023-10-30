package com.tasks.ifelse.programs;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st no :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd no :");
		int num2 = sc.nextInt();
		
		SumOfEven s = new SumOfEven();
		System.out.println("Checking for even...");
		s.SumOfEvenNum(num1, num2);
		
		System.out.println("Checking for odd...");
		SumOfOdd s1 = new SumOfOdd();
		s1.SumOfOddNum(num1, num2);
		
		sc.close();
	}

}
