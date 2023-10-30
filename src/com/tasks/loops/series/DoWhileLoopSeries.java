package com.tasks.loops.series;

public class DoWhileLoopSeries {

	public static void main(String[] args) {
		int n;
		int i;

		// Series 1: Generate the Series... 2 4 6 8 10 12 14 16 18 20
		System.out.println("Series 1: Generate the Series... 2 4 6 8 10 12 14 16 18 20");
		n = 2;
		do {
			System.out.print(n + " ");
			n += 2;
		} while (n <= 20);
		System.out.println();

		// Series 2: Generate the Series... 9 18 27 36 45 54 63 72 81 90
		System.out.println("Series 2: Generate the Series... 9 18 27 36 45 54 63 72 81 90");
		n = 9;
		do {
			System.out.print(n + " ");
			n += 9;
		} while (n <= 90);
		System.out.println();

		// Series 3: Generate the Series... 1 -2 3-4 5-6 7-8 9-10
		System.out.println("Series 3: Generate the Series... 1 -2 3-4 5-6 7-8 9-10");
		i = 1;
		do {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			} else {
				System.out.print(i + "-" + (i + 1) + " ");
			}
			i += 2;
		} while (i <= 10);
		System.out.println();

		// Series 4: Generate the Series... 5 10 15 20 25 30 35 40 45 50
		System.out.println("Series 4: Generate the Series... 5 10 15 20 25 30 35 40 45 50");
		n = 5;
		do {
			System.out.print(n + " ");
			n += 5;
		} while (n <= 50);
		System.out.println();

		// Series 5: Generate the Series... 1 10 100 1000
		System.out.println("Series 5: Generate the Series... 1 10 100 1000");
		i = 1;
		do {
			System.out.print(i + " ");
			i *= 10;
		} while (i <= 1000);
		System.out.println();

		// Series 6: Generate the Series... 1 3 6 10 15 21 28 36 45
		System.out.println("Series 6: Generate the Series... 1 3 6 10 15 21 28 36 45");
		int cnt = 1;
		i = 1;
		do {
			System.out.print(i + " ");
			i = i + cnt;
			cnt++;
		} while (i <= 45);
		System.out.println();

		// Series 7: Generate the Series... 8 16 24 32 40 48 56 64 72 80
		System.out.println("Series 7: Generate the Series... 8 16 24 32 40 48 56 64 72 80");
		n = 8;
		do {
			System.out.print(n + " ");
			n += 8;
		} while (n <= 80);
		System.out.println();

		// Series 8: Generate the Series... 0 1 1 2 3 5 8 13 21
		System.out.println("Series 8: Generate the Series... 0 1 1 2 3 5 8 13 21");
		int n1 = 0, n2 = 1, n3;
		i = 0;
		do {
			System.out.print(n1 + " ");
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			i++;
		} while (i < 9);
		System.out.println();

		// Series 9: Generate the Series... 1 4 9 16 25 36 49 64 81 100
		System.out.println("Series 9: Generate the series... 1 4 9 16 25 36 49 64 81 100");
		i = 1;
		do {
			System.out.print(i * i + " ");
			i++;
		} while (i <= 10);
		System.out.println();

		// Series 10: Generate the series... 3 6 9 12 15 18 21 24 27 30
		System.out.println("Series 10: Generate the series... 3 6 9 12 15 18 21 24 27 30");
		i = 3;
		do {
			System.out.print(i + " ");
			i += 3;
		} while (i <= 30);
		System.out.println();

		// Series 11: Generate the Series... 7 14 21 28 35 42 49 56 63 70
		System.out.println("Series 11: Generate the Series... 7 14 21 28 35 42 49 56 63 70");
		n = 7;
		do {
			System.out.print(n + " ");
			n += 7;
		} while (n <= 70);
		System.out.println();

		// Series 12: Generate the Series... 4 8 12 16 20 24 28 32 36 40
		System.out.println("Series 12: Generate the Series... 4 8 12 16 20 24 28 32 36 40");
		n = 4;
		do {
			System.out.print(n + " ");
			n += 4;
		} while (n <= 40);
		System.out.println();

		// Series 13: Generate the Series... 10 20 30 40 50 60 70 80 90 100
		System.out.println("Series 13: Generate the Series... 10 20 30 40 50 60 70 80 90 100");
		n = 10;
		do {
			System.out.print(n + " ");
			n += 10;
		} while (n <= 100);
		System.out.println();

		// Series 14: Generate the Series... 1 2 3 4 5 4 3 2 1
		System.out.println("Series 14: Generate the Series... 1 2 3 4 5 4 3 2 1");
		i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 5);
		i = 4;
		do {
			System.out.print(i + " ");
			i--;
		} while (i >= 1);
		System.out.println();

		// Series 15: Generate the Series... 6 12 18 24 30 36 42 48 54 60
		System.out.println("Series 15: Generate the Series... 6 12 18 24 30 36 42 48 54 60");
		n = 6;
		do {
			System.out.print(n + " ");
			n += 6;
		} while (n <= 60);
		System.out.println();
	}
}
