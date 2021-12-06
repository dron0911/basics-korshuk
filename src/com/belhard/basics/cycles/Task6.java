package com.belhard.basics.cycles;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("   Two numbers are given. Determine the numbers that are "
				+ "included in the recording of both the first and second numbers.\r\n");
		int numberOne = ConsoleReader.getIntFromConsole(scanner, "Enter first number: ");
		int numberTwo = ConsoleReader.getIntFromConsole(scanner, "Enter second number: ");
		resultNumbers(numberOne, numberTwo);
	}

	public static void resultNumbers(int numb1, int numb2) {
		int temp1;
		int temp2;
		while (numb1 > 0) {
			temp1 = numb1 % 10;
			numb1 /= 10;
			temp2 = numb2;
			while (temp2 > 0) {
				if (temp2 % 10 == temp1) {
					System.out.print(" (" + temp1 + ") ");
				}
				temp2 /= 10;
			}
		}
		System.out.println();
	}

}
