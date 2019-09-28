package utils;

import java.util.Scanner;

public class InputUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static void liniaOddzielajaca() {
        System.out.println("---------------------------------");
    }

    public static String pobierzTekst(String message) {
        System.out.println(message);
        return scanner.nextLine().toLowerCase();
    }

    public static char pobierzLitere(String message) {
        System.out.println(message);
        return scanner.next().charAt(0);
    }

    public static char pobierzLitere() {
        return pobierzLitere("Proszę podaj jakąś literę : ");
    }

}
