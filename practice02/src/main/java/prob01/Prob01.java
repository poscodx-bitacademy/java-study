package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int[] MONEYS = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

		System.out.print("금액:");
		int money = scanner.nextInt();

		for(int i = 0; i < MONEYS.length; i++) {
			int count = money / MONEYS[i];
			money -= (count * MONEYS[i]);

			System.out.println(MONEYS[i] + "원 : " + count + "개");
		}

		scanner.close();
	}
}
