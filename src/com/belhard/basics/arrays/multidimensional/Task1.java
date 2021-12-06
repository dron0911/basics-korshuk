package com.belhard.basics.arrays.multidimensional;

import com.belhard.basics.util.ResultPrinter;

public class Task1 {
	public static void main(String[] args) throws Exception {
		int[][] array = new int[][] { { 0, 1, 2, 3, 4 }, { 10, 11, 12, 13, 14 }, { 20, 21, 22, 23, 24 },
				{ 7, 7, 7, 7, 7 } };
		ResultPrinter.printArrOfArr(array, "Array:\n");
	}
}
