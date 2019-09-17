//        Zdefiniować funkcję int strpos(String text, char z) , która zwraca indeks
//        na którym znajduje się znak z (drugi parametr) w podanym łańcuchu text .
//        Jeżeli znak z nie występuje w łańcuchu, to wynikiem funkcji powinno być -1.
//        Uwaga - pozycje znaków numerujemy począwszy od 0.



package _002.Zadania_5;

import java.util.Scanner;

public class Zadanie_5_3 {

    public static void liniaOddzielajaca () {
        System.out.println("---------------------------------");
    }

    public static String pobierzTekst() {

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Proszę podaj jakiś tekst : ");
        String pobierzTekst;
        pobierzTekst = scanner.nextLine();
        String pobierzTekstMaleLitery = pobierzTekst.toLowerCase();
        return pobierzTekstMaleLitery;
    }

    public static char pobierzLitere() {

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Proszę podaj jakąś literę : ");
        char pobierzLitera = scanner.next().charAt(0);
        return pobierzLitera;
    }

    public static int strpos (String text, char z){
//        System.out.println("Znaki wrzucono w tabelę: ");
        char[] tabelaZnakow = text.toCharArray();
        for (char znak : tabelaZnakow) {
//            System.out.print(znak + " ");
        }
//        System.out.println("");
        liniaOddzielajaca();
        int brakZnaku = 0;
        for (int i = 0; i < tabelaZnakow.length; i++) {

            if (tabelaZnakow[i] == z){
                System.out.println("Miejsce litery '" + z + "' jest nr " + i);
                brakZnaku++;
            }
        }
        if (brakZnaku == 0){
                System.out.println("Miejsce litery '" + z + "' jest nr -1");
        }
        return z;
    }

    public static void main(String[] args) {

        String pobranyTekst = pobierzTekst();
        char pobranaLitera = pobierzLitere();

//        liniaOddzielajaca();

//        System.out.println("Tekst: " + pobranyTekst);
//        System.out.print("Litera: ");
//        System.out.println(pobranaLitera);

//        liniaOddzielajaca();

                strpos(pobranyTekst, pobranaLitera);

    }
}
