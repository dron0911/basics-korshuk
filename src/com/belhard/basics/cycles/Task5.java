package com.belhard.basics.cycles;

import java.math.BigInteger;

public class Task5 {
	public static void main(String[] args) {
		BigInteger prodaction = BigInteger.valueOf(1);
		for (int i = 2; i <= 200; i++) {
			prodaction = prodaction.multiply(BigInteger.valueOf((long) i * i));
		}
		System.out.println(prodaction);
	}
}
