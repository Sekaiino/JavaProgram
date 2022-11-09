package labo5;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.print("Dernier nombre ? ");
        int nombre = prb.Console.lireInt();

        for (int i = 1; i <= nombre; i++) {
            if(i < nombre) {
                if(i % 3 == 0 && i % 5 == 0) {
                    System.out.print("FizzBuzz, ");
                }
                else if(i % 3 == 0) {
                    System.out.print("Fizz, ");
                }
                else if(i % 5 == 0) {
                    System.out.print("Buzz, ");
                } else {
                    System.out.printf("%d, ", i);
                }
            } else {
                if(i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                else if(i % 3 == 0) {
                    System.out.println("Fizz");
                }
                else if(i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.printf("%d\n", i);
                }
            }
        }
    }
}
