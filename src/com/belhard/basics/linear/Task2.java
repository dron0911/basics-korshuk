package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("  You are given a real number R of the form nnn.ddd\n"
				+ "(three digital digits in fractional and integer parts).\n"
				+ "Swap the fractional and integer parts of the number and\n"
				+ "print the resulting value of the number.\n");
		double initialNumber = ConsoleReader.getDoubleFromConsole(scanner, "Enter R: ");
		double reversedNumber = replacement(initialNumber);
		System.out.print("Result is: " + reversedNumber);
	}

	public static double replacement(double r) {
		return (r * 1000) % 1000 + (int) (r) / 1000.0;
	}

}
