package com.belhard.basics.arrays.multidimensional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayUtil;
import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.ResultPrinter;

public class Task2 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int n = ConsoleReader.dimensionOfArray(scanner);
		int[][] array = ArrayUtil.randomArrOfArrOfInt(n);
		ResultPrinter.printArrOfArr(array, "Array:\n");
		int[][] array2 = sortRows(array, scanner);
		ResultPrinter.printArrOfArr(array2, "\nArray with sorted row:\n");

	}

	public static int[][] sortRows(int[][] array, Scanner scanner) {
		int rowNumber = ConsoleReader.getIntFromConsole(scanner, "\nEnter row number : ");
		int ascOrDesc = ConsoleReader.getIntFromConsole(scanner,
				"\nEnter (1) if you want to sort in ascending order, or (2) if in descending order. : ");

		if (ascOrDesc == 1) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] == array[rowNumber - 1]) {
					ArrayUtil.bubbleSort(array[i]);
				}
			}
		} else if (ascOrDesc == 2) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] == array[rowNumber - 1]) {
					ArrayUtil.selectionSort(array[i]);
				}
			}
		} else {
			throw new RuntimeException("Error! Expected 1 or 2.");
		}
		return array;
	}
}
