package labo6;

import io.Console;;

public class MessageSecret {
    public static void main(String[] args) {

        System.out.print("Message ? ");
        String message = Console.lireString();

        System.out.print("Clé ? ");
        String cle = Console.lireString();

        String messChiffrer = Vigenere.chiffrer(message, cle);
        System.out.printf("Message chiffrer = %s\n\n", messChiffrer);

        String messDechiffrer = Vigenere.dechiffrer(messChiffrer, cle);
        System.out.printf("Message déchiffrer = %s\n", messDechiffrer);
    }
}
