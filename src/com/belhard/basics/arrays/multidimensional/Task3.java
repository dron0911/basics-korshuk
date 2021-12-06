package com.belhard.basics.arrays.multidimensional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayUtil;
import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.ResultPrinter;

public class Task3 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int n = ConsoleReader.dimensionOfArray(scanner);
		int[][] array = ArrayUtil.randomArrOfArrOfInt(n);
		ResultPrinter.printArrOfArr(array, "Array:\n");
		maxColumnSumAndNumber(scanner, array);

	}

	public static void maxColumnSumAndNumber(Scanner scanner, int[][] array) {
		int sum = 0;
		int column = 0;
		int[] array2 = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			sum = 0;
			for (int j = 0; j < array[i].length; j++) {
				sum += array[j][i];
				array2[i] = sum;
			}
		}

		int max = 0;
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] > max) {
				max = array2[i];
				column = i;
			}
		}
		System.out.println("Number of max sum column[" + (column + 1) + "]. " + "Sum of the column is equal: " + max);
	}
}
