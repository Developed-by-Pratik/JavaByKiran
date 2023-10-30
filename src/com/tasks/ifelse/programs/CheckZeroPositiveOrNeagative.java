package com.tasks.ifelse.programs;

import java.util.Scanner;

public class CheckZeroPositiveOrNeagative {

	void CheckZPN(int num) {
		
		if (num == 0) {
			System.out.println("Zero!");
		}else if (num > 0) {
			System.out.println("Positive!!");
		}else {
			System.out.println("Negative!!!");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		CheckZeroPositiveOrNeagative c = new CheckZeroPositiveOrNeagative();
		c.CheckZPN(num);
		
		sc.close();
	}

}
