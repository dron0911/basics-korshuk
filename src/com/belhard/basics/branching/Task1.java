package com.belhard.basics.branching;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = ConsoleReader.getIntFromConsole(scanner, "Enter a: ");
		int b = ConsoleReader.getIntFromConsole(scanner, "Enter b: ");
		int c = ConsoleReader.getIntFromConsole(scanner, "Enter c: ");
		int d = ConsoleReader.getIntFromConsole(scanner, "Enter d: ");
		int max = maxValue(a, b, c, d);
		System.out.println("\nmax(min(a,b); min(c,d)) = " + max);
	}

	public static int maxValue(int a, int b, int c, int d) {
		int minAB;
		int minCD;
		int max;
		if (a < b) {
			minAB = a;
		} else {
			minAB = b;
		}
		if (c < d) {
			minCD = c;
		} else {
			minCD = d;
		}
		if (minAB < minCD) {
			max = minCD;
		} else {
			max = minAB;
		}
		return max;
	}

}
