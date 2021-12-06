package com.belhard.basics.arrays.onedimensional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayUtil;
import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.ResultPrinter;

public class Task3 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int n = ConsoleReader.dimensionOfArray(scanner);
		int[] array = ArrayUtil.randomArrayOfInt(n);
		int min = ArrayUtil.findArrayMin(array);
		int[] array2 = new int[n];
		ResultPrinter.printArray(array, "Array : ");
		newArrayWithoutMin(array, array2, min);

	}

	public static void newArrayWithoutMin(int[] array, int[] array2, int min) {
		System.out.print("\nArray without min element : ");
		int j = 0;
		for (int mas : array) {
			if (mas != min) {
				array2[j++] = mas;
				System.out.print("(" + mas + ") ");
			}
		}
	}
}
