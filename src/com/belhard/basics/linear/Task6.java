package com.belhard.basics.linear;

public class Task6 {
	public static void main(String[] args) {
		System.out.println("   For this area, compose a linear program that prints true if the point\n"
				+ "with coordinates (-1, 0) belongs to the filled area, and false otherwise.\n");
		int x = 0;
		int y = -1;
		boolean rez = result(x, y);
		System.out.println(rez);
	}

	public static boolean result(int x, int y) {
		if ((x >= -4 & x <= 4 & y >= -3 & y <= 0) || (x >= -2 & x <= 2 & y <= 4 & y > 0)) {
			return true;
		} else {
			return false;
		}
	}

}
