package com.belhard.basics.branching;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("   The two angles of the triangle are given (in degrees).\n"
				+ "Determine if such a triangle exists, and if so, whether it will\n"
				+ "be rectangular. (A triangle cannot exist if the sum of its angles is not 180)\n");
		int a = ConsoleReader.getIntFromConsole(scanner, "Enter angle a: ");
		int b = ConsoleReader.getIntFromConsole(scanner, "Enter angle b: ");
		result(a, b);
	}

	public static void result(int a, int b) {
		if (a + b >= 180 || a < 0 || b < 0 || (180 - a - b) < 0 || a > 178 || b > 178 || (180 - a - b) > 178) {
			System.out.println("There is no such triangle");
		} else {
			System.out.println("Triangle is exists");
			if (a == 90 || b == 90 || (180 - a - b) == 90) {
				System.out.println("Right triangle");
			} else {
				System.out.println("Triangle is not right");
			}
		}

	}
}
