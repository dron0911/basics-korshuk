package com.belhard.basics.cycles;

public class Task3 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i * i;
		}
		System.out.println("Сумма квадратов чисел от 1 до 100 равна " + sum);
		System.out.println("Сумма квадратов чисел от 1 до 100 равна " + 100 * (100 + 1) * (2 * 100 + 1) / 6);
	}

}
