package labo6;

import io.Console;

public class Debug1 {
    public static void main(String[] args) {
		
		final double PU = 14.95;
		
		System.out.print("Quantité ? ");
		double qte = Console.lireDouble();
		
		System.out.printf("Total = %.2f €\n", qte * PU);
	}
}
