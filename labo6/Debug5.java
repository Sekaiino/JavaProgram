package labo6;

import io.Console;

public class Debug5 {

	public static void main(String[] args) {
		
		System.out.print("Un entier positif ? ");
		int a = Console.lireInt();
		
		double x = 0.0;
		int i = 0;
		while (x != a) {
			x = x + 0.1;
			i++;
		}
		
		System.out.println("x = " + x);
		System.out.println("i = " + i);
	}

}
