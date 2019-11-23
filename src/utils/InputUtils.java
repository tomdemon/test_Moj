package utils;

import java.util.Scanner;

public class InputUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static void liniaOddzielajaca() {
        System.out.println("---------------------------------");
    }

    public static String pobierzTekst(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public static String pobierzTekst() {
        return pobierzTekst("Proszę podaj jakiś tekst: ");
    }

    public static char pobierzLitere(String message) {
        System.out.println(message);
        return scanner.next().charAt(0);
    }

    public static String pobierzTekstNaMaleLitery(String message) {
        System.out.println(message);
        return scanner.nextLine().toLowerCase();
    }

    public static String pobierzTekstNaDuzeLitery(String message) {
        System.out.println(message);
        return scanner.nextLine().toUpperCase();
    }

    public static String pobierzTekstNaMaleLitery() {
        return pobierzTekstNaMaleLitery("Proszę podaj jakiś tekst: ");
    }

    public static String pobierzTekstNaDuzeLitery() {
        return pobierzTekstNaDuzeLitery("Proszę podaj jakiś tekst: ");
    }

    public static char pobierzLitere() {
        return pobierzLitere("Proszę podaj jakąś literę: ");
    }


    public static long pobierzLiczbe(String message) {
        System.out.println (message);
        return scanner.nextInt();
    }

    public static long pobierzLiczbe() {
        return pobierzLiczbe("Proszę podaj liczbę większą od 0: ");
    }

    public static int pobierzLiczbeInt(String message) {
        System.out.println (message);
        return scanner.nextInt();
    }

    public static int pobierzLiczbeInt() {
        return pobierzLiczbeInt ("Proszę podaj liczbę większą od 0: ");
    }


}
