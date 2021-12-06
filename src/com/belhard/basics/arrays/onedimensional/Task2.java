package com.belhard.basics.arrays.onedimensional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayUtil;
import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.ResultPrinter;

public class Task2 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int n = ConsoleReader.dimensionOfArray(scanner);
		double[] array = ArrayUtil.randomArrayOfDouble(n);
		ResultPrinter.printArray(array, "Array : ");
		printCount(array);
	}

	public static void printCount(double[] array) {
		int[] result = new int[] { 0, 0, 0 };
		for (double mass : array) {
			if (mass < 0) {
				result[0]++;
			} else if (mass == 0) {
				result[1]++;
			} else if (mass > 0) {
				result[2]++;
			}
		}
		System.out.println("\n������������� ���������: " + result[0]);
		System.out.println("������ ���� ���������: " + result[1]);
		System.out.println("������������� ���������: " + result[2]);
	}
}
