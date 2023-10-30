package com.tasks.loops.series;

public class ForLoopSeries {

	public static void main(String[] args) {

		// Series 1: Generate the Series... 2 4 6 8 10 12 14 16 18 20
		System.out.println("Series 1: Generate the Series... 2 4 6 8 10 12 14 16 18 20");
		for (int n = 2; n <= 20; n = n + 2) {
			System.out.print(n + " ");
		}
		System.out.println();

		// Series 2: Generate the Series... 9 18 27 36 45 54 63 72 81 90
		System.out.println("Series 2: Generate the Series... 9 18 27 36 45 54 63 72 81 90");
		for (int n = 9; n < 90; n++) {
			if (n % 9 == 0) {
				System.out.print(n + " ");
			}
		}
		System.out.println();

		// Series 3: Generate the Series... 1 -2 3-4 5-6 7-8 9-10
		System.out.println("Series 3: Generate the Series... 1 -2 3-4 5-6 7-8 9-10");
		for (int i = 1; i >= -10; i--) {
			if (i != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// Series 4: Generate the Series... 5 10 15 20 25 30 35 40 45 50
		System.out.println("Series 4: Generate the Series... 5 10 15 20 25 30 35 40 45 50");
		for (int i = 5; i <= 50; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// Series 5: Generate the Series... 1 10 100 1000
		System.out.println("Series 5: Generate the Series... 1 10 100 1000");
		for (int i = 1; i <= 1000;) {
			System.out.print(i + " ");
			i = i * 10;
		}
		System.out.println();

		// Series 6: Generate the Series... 1 3 6 10 15 21 28 36 45
		System.out.println("Series 6: Generate the Series... 1 3 6 10 15 21 28 36 45");
		int cnt = 1;
		for (int i = 1; i <= 45; i++) {
			System.out.print(i + " ");
			i = i + cnt;
			cnt++;
		}
		System.out.println();

		// Series 7: Generate the Series... 8 16 24 32 40 48 56 64 72 80
		System.out.println("Series 7: Generate the Series... 8 16 24 32 40 48 56 64 72 80");
		for (int i = 8; i <= 80; i++) {
			if (i % 8 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// Series 8: Generate the Series... 0 1 1 2 3 5 8 13 21
		System.out.println("Series 8: Generate the Series... 0 1 1 2 3 5 8 13 21");
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		for (int i = 0; i < 9; i++) {
			System.out.print(n1 + " ");
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		System.out.println();

		// Series 9: Generate the Series... 1 4 9 16 25 36 49 64 81 100
		System.out.println("Series 9: Generate the series... 1 4 9 16 25 36 49 64 81 100");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * i + " ");
		}
		System.out.println();

		// Series 10: Generate the series... 3 6 9 12 15 18 21 24 27 30
		System.out.println("Series 10: Generate the series... 3 6 9 12 15 18 21 24 27 30");
		for (int i = 1; i <= 30; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// Series 11: Generate the Series... 7 14 21 28 35 42 49 56 63 70
		System.out.println("Series 11: Generate the Series... 7 14 21 28 35 42 49 56 63 70");
		for (int i = 1; i <= 70; i++) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// Series 12: Generate the Series... 4 8 12 16 20 24 28 32 36 40
		System.out.println("Series 12: Generate the Series... 4 8 12 16 20 24 28 32 36 40");
		for (int i = 1; i <= 40; i++) {
			if (i % 4 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// Series 13: Generate the Series... 10 20 30 40 50 60 70 80 90 100
		System.out.println("Series 13: Generate the Series... 10 20 30 40 50 60 70 80 90 100");
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// Series 14: Generate the Series... 1 2 3 4 5 4 3 2 1
		System.out.println("Series 14: Generate the Series... 1 2 3 4 5 4 3 2 1");
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		for (int i = 4; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		// Series 15: Generate the Series... 6 12 18 24 30 36 42 48 54 60
		System.out.println("Series 15: Generate the Series... 6 12 18 24 30 36 42 48 54 60");
		for (int i = 1; i <= 60; i++) {
			if (i % 6 == 0) {
				System.out.print(i + " ");
			}

		}
	}

}
