package com.belhard.basics.arrays.multidimensional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayUtil;
import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.ResultPrinter;

public class Task5 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int n = ConsoleReader.dimensionOfArray(scanner);
		int[][] array = ArrayUtil.randomArrOfArrOfInt(n);
		ResultPrinter.printArrOfArr(array, "Array:\n");
		sortByColumns(array, scanner);
	}

	public static void sortByColumns(int[][] array, Scanner scanner) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = j + 1; k < array[i].length; k++) {
					if (i % 2 == 0) {
						if (array[j][i] > array[k][i]) {
							int temp = array[j][i];
							array[j][i] = array[k][i];
							array[k][i] = temp;
						}
					} else {
						if (array[j][i] < array[k][i]) {
							int temp1 = array[j][i];
							array[j][i] = array[k][i];
							array[k][i] = temp1;
						}
					}
				}
			}
		}
		ResultPrinter.printArrOfArr(array, "Sorted: \n");

	}
}
