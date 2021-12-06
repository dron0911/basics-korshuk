package com.belhard.basics.cycles;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = ConsoleReader.getIntFromConsole(scanner, "Enter x: ");
		System.out.println("Sum numbers from 1 to x is equal : " + sumNumbers(x));
	}

	public static int sumNumbers(int x) {
		int sum = 0;
		if (x > 0) {
			for (int i = 1; i <= x; i++) {
				sum += i;
			}
			return sum;
		} else {
			for (int i = 1; i >= x; i--) {
				sum += i;
			}
			return sum;
		}
	}

}
