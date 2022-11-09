package labo6;

import io.Console;

public class Debug2 {

	public static void main(String[] args) {
		
		double nombre1, nombre2, nombre3;
		
		System.out.print("Nombre 1 ? ");
		nombre1 = Console.lireDouble();
		System.out.print("Nombre 2 ? ");
		nombre2 = Console.lireDouble();
		System.out.print("Nombre 3 ? ");
		nombre3 = Console.lireDouble();
		
		double moyenne = (nombre1 + nombre2 + nombre3) / 3;
		
		System.out.printf("Moyenne = %.2f\n", moyenne);
	}

}
