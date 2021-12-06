package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("   Calculate the value of the expression using the formula (all variables are valid):\n");
		double x = ConsoleReader.getDoubleFromConsole(scanner, "Enter a in degrees: ");
		double y = ConsoleReader.getDoubleFromConsole(scanner, "Enter a in degrees: ");
		double result = solveFunction(x, y);
		System.out.println("result is equal:" + result);
	}

	public static double solveFunction(double x, double y) {
		double radX = Math.toRadians(x);
		double radY = Math.toRadians(y);
		double temp = Math.cos(radX) - Math.sin(radY);
		if (temp == 0) {
			throw new RuntimeException("Error! Denominator shouldn't be equal 0");
		} else {
			return (Math.sin(radX) + Math.cos(radY)) / temp * Math.tan(radX * radY);
		}
	}

}
