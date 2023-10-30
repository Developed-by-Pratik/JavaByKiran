package com.tasks.ifelse.programs;

import java.util.Scanner;

public class CheckEvenOrOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");
		int num = sc.nextInt();

		CheckEven e = new CheckEven();
		e.CheckEvenOrOdd(num);
		
		CheckOdd d = new CheckOdd();
		d.CheckEvenOrOdd(num);
		
		sc.close();
	}

}
