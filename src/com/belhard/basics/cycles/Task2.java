package com.belhard.basics.cycles;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = ConsoleReader.getIntFromConsole(scanner, "Enter a: ");
		int b = ConsoleReader.getIntFromConsole(scanner, "Enter b: ");
		int h = ConsoleReader.getIntFromConsole(scanner, "Enter h: ");
		function(a, b, h);
	}

	public static void function(int a, int b, int h) {
		int y = 0;
		for (int x = a; x <= b; x += h) {
			if (x > 2) {
				y = x;
			} else {
				y = -x;
			}
			System.out.println("When x = " + x + ", y = " + y);
		}
	}
}
