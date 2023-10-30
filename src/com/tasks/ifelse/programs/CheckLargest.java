package com.tasks.ifelse.programs;

import java.util.Scanner;

public class CheckLargest {
	
	void FindMax(int num1, int num2) {
		if(num1 > num2)
		{
			System.out.println(num1 + " is Greater than "+num2);
		}else {
			System.out.println(num2 + " is Greater than "+num1);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st Num :");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd Num :");
		int num2 = sc.nextInt();
		
		CheckLargest l = new CheckLargest();
		l.FindMax(num1,num2);
		
		
		sc.close();
	}
}
