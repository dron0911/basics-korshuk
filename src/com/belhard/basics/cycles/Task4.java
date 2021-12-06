package com.belhard.basics.cycles;

public class Task4 {
	public static void main(String[] args) {
		System.out.println("\n\tAmerican Standard Code for Information Interchange\n");
		for (int i = 32; i <= 126; i++) {
			System.out.print("[ " + i + " ]  =  " + (char) i + "\t");
			if ((i - 31) % 5 == 0) {
				System.out.println();
			}
		}
	}
}
