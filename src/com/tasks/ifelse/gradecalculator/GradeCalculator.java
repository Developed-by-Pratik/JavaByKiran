package com.tasks.ifelse.gradecalculator;

import java.util.Scanner;

public class GradeCalculator {

	void checkScore(int marks) {

		if (marks >= 90) {
			System.out.println("Grade A !");
		} else if (marks >= 80 && marks <= 89) {
			System.out.println("Grade B !");
		} else if (marks >= 70 && marks <= 79) {
			System.out.println("Grade C !");
		} else if (marks >= 60 && marks <= 69) {
			System.out.println("Grade D !");
		} else {
			System.out.println("Fail!");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks :");
		int marks = sc.nextInt();

		GradeCalculator g = new GradeCalculator();
		g.checkScore(marks);
		
		sc.close();
	}

}
