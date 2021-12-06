package com.belhard.basics.arrays.sorting;

import java.util.Scanner;

import com.belhard.basics.util.ArrayUtil;
import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.ResultPrinter;

public class Task2 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		Scanner scanner = new Scanner(System.in);
		int n = ConsoleReader.dimensionOfArray(scanner);
		int[] array = ArrayUtil.randomArrayOfInt(n);
		ResultPrinter.printArray(array, "Array : ");
		int[] sortedArray = ArrayUtil.insertionSort(array);
		ResultPrinter.printArray(sortedArray, "\nInsertion sort result : ");
		System.out.println("\nTime milis " + (System.currentTimeMillis() - time));

	}

}
