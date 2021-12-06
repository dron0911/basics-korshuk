package com.belhard.basics.linear;

import java.util.Scanner;

import com.belhard.basics.util.ConsoleReader;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("   A natural number T is given, which represents the duration of\n"
				+ "the elapsed time in seconds. Output this value of duration in hours,\n"
				+ "minutes and seconds in the following form: ÍÍh ÌÌmin SSs.\n");
		int totalSeconds = ConsoleReader.getIntFromConsole(scanner, "\nEnter number of seconds: ");
		result(totalSeconds);
	}

	public static void result(int sec) {
		int hours = sec / 3600;
		int temp = sec - (hours * 3600);
		int minutes = temp / 60;
		int seconds = temp - (minutes * 60);
		System.out.println(hours + "h " + minutes + "min " + seconds + "s");
	}
}
