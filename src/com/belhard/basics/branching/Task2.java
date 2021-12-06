package com.belhard.basics.branching;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = ConsoleReader.getIntFromConsole(scanner, "Enter x: ");
		System.out.println("F(x)= " + solveFunction(x));
	}

	public static double solveFunction(int x) {
		double function;
		if (x <= 3) {
			function = x * x - 3 * x + 9;
		} else {
			function = 1 / (x * x * x + 6);
		}
		return function;
	}

}
