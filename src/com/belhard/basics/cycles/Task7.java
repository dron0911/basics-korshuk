package com.belhard.basics.cycles;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("   For each natural number in the range from m to n,"
				+ " output all divisors except one and the number itself.\n");
		int m = ConsoleReader.getIntFromConsole(scanner, "Enter m: ");
		int n = ConsoleReader.getIntFromConsole(scanner, "Enter n: ");
		System.out.println();
		divisorsFunction(m, n);

	}

	public static void divisorsFunction(int m, int n) {
		for (int i = m; i <= n; i++) {
			System.out.print("divisors of " + i + ": ");
			for (int j = 2; j < n; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
}
