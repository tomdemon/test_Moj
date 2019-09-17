//        Napisz program, który umozliwia szyfrowanie podanego ciagu znaków przy uzy-
//        ciu szyfru Cezara, który jest szczególnym przypadkiem szyfru podstawieniowego
//        monoalfabetycznego.
//        Uzytkownik program podaje tekst do zaszyfrowania oraz liczbe n, o która prze-
//        suniety jest alfabet za pomoca którego szyfrujemy tekst. Dla uproszczenia mozna
//        przyjac, ze łanuch wejsciowy składa sie tylko z małych liter alfabetu angielskiego,
//        tj. ’a’ – ’z’ (26 znaków) oraz spacja


//        wersja 2 - działanie na znakach ASCII.
//          Niestety wersja uboższa bo działa na wszystkich znakach ASCII a nie tylko alfabecie + spacja.
//          Do tego gdy wpiszemu bardzo dużą wartość przesunięcia to może nie znaleźć znaków, tak samo jak wpiszemy duzą
//             wartość ujemną (chociaż przy -1000 znalazlo mi arabske znaczki :).


package _002.Zadania_4;

import java.util.Scanner;

public class Zadanie_4_6_ver2 {

    public static void liniaOddzielajaca () {
        System.out.println("---------------------------------");
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Proszę podać łańcuch znaków do zaszyfrowania : ");

        String ciagZnakow = scanner.nextLine();

        System.out.println("Proszę podać przesunięcie : ");

        int przesuniecie = scanner.nextInt();

        liniaOddzielajaca();

        System.out.println(ciagZnakow + " " + przesuniecie);

        liniaOddzielajaca();

        System.out.println("Znaki wrzucono w tabelę: ");

//        String ciagZnakowMaleLitery = ciagZnakow.toLowerCase();

        char[] tabelaZnakow = ciagZnakow.toCharArray();
        for (char znak : tabelaZnakow) {
            System.out.print(znak + " ");
        }
        System.out.println("");
        liniaOddzielajaca();

        System.out.println("Zamiana na znaki ASCII");

        int[] tabelaZnakowAscii = new int[tabelaZnakow.length];
        int znakAscii;

        for (int i = 0; i < tabelaZnakow.length; i++) {
            znakAscii = (int) tabelaZnakow[i];
            tabelaZnakowAscii[i] = znakAscii;
            System.out.print(tabelaZnakow[i] + " = " + tabelaZnakowAscii[i] + " , ");
        }
        System.out.println(" ");
        liniaOddzielajaca();

        System.out.println("Dodanie przesunięcia: " + przesuniecie + " i szyfrowanie");

        int[] tabelaZnakowAsciiZPrzesunieciem = new int [tabelaZnakow.length];
        char[] tabelaZnakowPoSzyfrowaniu = new char[tabelaZnakow.length];

        for (int i = 0; i < tabelaZnakowAscii.length; i++) {

            int znakAscii2 = tabelaZnakowAscii[i];

            tabelaZnakowAsciiZPrzesunieciem[i] = znakAscii2 + przesuniecie;
            char znakZaszyfrowany = (char) tabelaZnakowAsciiZPrzesunieciem [i];
            tabelaZnakowPoSzyfrowaniu[i] = znakZaszyfrowany;

            System.out.print(tabelaZnakowAsciiZPrzesunieciem[i] + " = " + tabelaZnakowPoSzyfrowaniu[i] + " , ");
        }
        System.out.println(" ");
//            liniaOddzielajaca();
        System.out.print("Oryginał: ");
        System.out.println(tabelaZnakow);
        System.out.print("Po szyfrowaniu: ");
        System.out.println(tabelaZnakowPoSzyfrowaniu);
    }
}
