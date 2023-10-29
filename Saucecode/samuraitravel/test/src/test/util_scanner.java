package test;

import java.util.Scanner;

public class util_scanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("整数を入力する");
		int number = scanner.nextInt();

		if (number % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}

		scanner.close();

	}

}
