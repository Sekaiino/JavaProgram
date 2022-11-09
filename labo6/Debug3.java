package labo6;

import io.Console;

public class Debug3 {

	public static void main(String[] args) {
		
		double fahrenheit, celsius;
		
		System.out.print("Température en °F ? ");
		fahrenheit = Console.lireDouble();
		
		celsius = 5 / 9 * (fahrenheit - 32);
		
		System.out.printf("%.1f °F = %.1f °C\n", fahrenheit, celsius);
	}

}
