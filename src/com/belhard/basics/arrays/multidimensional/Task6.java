package com.belhard.basics.arrays.multidimensional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayUtil;
import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.ResultPrinter;

public class Task6 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int n = ConsoleReader.dimensionOfArray(scanner);
		int[][] array = ArrayUtil.randomArrOfArrOfInt(n);
		ResultPrinter.printArrOfArr(array, "Array:\n");
		changeColumns(array, scanner);
	}

	public static void changeColumns(int[][] array, Scanner scanner) {
		int i1 = ConsoleReader.getIntFromConsole(scanner, "Column number: ");
		int i2 = ConsoleReader.getIntFromConsole(scanner, "Replace with: ");
		for (int i = 0; i < array.length; i++) {
			int tmp = array[i][i1 - 1];
			array[i][i1 - 1] = array[i][i2 - 1];
			array[i][i2 - 1] = tmp;
		}
		ResultPrinter.printArrOfArr(array, "Changed: \n");

	}

}
