package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("   Calculate the value of the expression using the formula (all variables are valid):\n");
		double a = ConsoleReader.getDoubleFromConsole(scanner, "Enter a: ");
		double b = ConsoleReader.getDoubleFromConsole(scanner, "Enter b: ");
		double c = ConsoleReader.getDoubleFromConsole(scanner, "Enter c: ");
		double result = solveFunction(a, b, c);
		System.out.println(result);
	}

	public static double solveFunction(double a, double b, double c) {
		double temp = Math.sqrt(b * b + 4 * a * c);
		if (temp < 0 || a == 0) {
			throw new RuntimeException("Error! 'a' shouldn't be equal 0 and root value shoudn't be negative");
		} else {
			double result = ((b + temp) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
			return result;
		}
	}

}
