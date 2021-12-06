package com.belhard.basics.arrays.multidimensional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayUtil;
import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.ResultPrinter;

public class Task4 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int n = ConsoleReader.dimensionOfArray(scanner);
		int[][] array = ArrayUtil.randomArrOfArrOfInt(n);
		ResultPrinter.printArrOfArr(array, "Array:\n");
		oddColumns(array);
	}

	public static void oddColumns(int[][] array) {
		System.out.println("The result is: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j += 2) {
				if (array[0][j] > array[array.length - 1][j]) {
					System.out.printf("%7d", array[i][j]);
				}
			}
			System.out.println();
		}
	}
}
