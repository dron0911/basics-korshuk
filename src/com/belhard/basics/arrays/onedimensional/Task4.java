package com.belhard.basics.arrays.onedimensional;

import java.util.Scanner;

import com.belhard.basics.util.ArrayUtil;
import com.belhard.basics.util.ConsoleReader;
import com.belhard.basics.util.ResultPrinter;

public class Task4 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int n = ConsoleReader.dimensionOfArray(scanner);
		int[] array = ArrayUtil.randomArrayOfInt(n);
		ResultPrinter.printArray(array, "Array :");
		int result = popularElement(array);
		System.out.print("\nPopular element is " + result);
	}

	public static int popularElement(int[] array) {
		ArrayUtil.bubbleSort(array);
		int count1 = 0;
		int count2 = 0;
		int pupular1 = 0;
		int popular2 = 0;
		for (int i = 0; i < array.length; i++) {
			pupular1 = array[i];
			count1 = 0;
			for (int j = i + 1; j < array.length; j++) {
				if (pupular1 == array[j])
					count1++;
			}
			if (count1 > count2) {
				popular2 = pupular1;
				count2 = count1;
			} else if (count1 == count2) {
				popular2 = Math.min(popular2, pupular1);
			}
		}
		return popular2;
	}
}
