package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Find the value of the function: z = ((a - 3) * b / 2) + c\n");
		int a = ConsoleReader.getIntFromConsole(scanner, "Enter a: ");
		int b = ConsoleReader.getIntFromConsole(scanner, "Enter b: ");
		int c = ConsoleReader.getIntFromConsole(scanner, "Enter c: ");
		double result = function(a, b, c);
		System.out.println("\nz = " + result);
	}

	public static double function(int a, int b, int c) {
		return (((a - 3) * b / 2.0) + c);
	}

}
