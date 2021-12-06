package com.belhard.basics.arrays.onedimensional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayUtil;
import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.ResultPrinter;

public class Task1 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int n = ConsoleReader.dimensionOfArray(scanner);
		int[] array = ArrayUtil.randomArrayOfInt(n);
		ResultPrinter.printArray(array, "Array : ");
		sumOfElementsMultiplesK(array, scanner);
	}

	public static void sumOfElementsMultiplesK(int[] array, Scanner scanner) {
		int k = ConsoleReader.getIntFromConsole(scanner, "\nEnter K: ");
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % k == 0) {
				sum += array[i];
			}
		}
		System.out.print("\nSum of elements that is multiples K is equal : " + sum);
	}
}
