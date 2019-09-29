//        Napisać funkcję String flipCase(String text) , która zamieni małe litery na
//        duże i odwrotnie w łańcuchu podanym jako parametr. Wynikiem ma być łańcuch
//        znaków zawierający kopię łańcucha po zmianie wielkości liter.

package _002.Zadania_5;

import utils.InputUtils;

import javax.print.DocFlavor;
import javax.swing.*;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class Zadanie_5_4 {


    public static String flipCase(String text) {

//        System.out.println("Znaki wrzucono w tabelę: ");

//        String ciagZnakowMaleLitery = ciagZnakow.toLowerCase();

        char[] tabelaZnakow = text.toCharArray();
        for (char znak : tabelaZnakow) {
//            System.out.print(znak + " ");
        }
//        System.out.println("");
//        InputUtils.liniaOddzielajaca();

//        System.out.println("Zamiana na znaki ASCII");

        int[] tabelaZnakowAscii = new int[tabelaZnakow.length];
        int znakAscii;

        for (int i = 0; i < tabelaZnakow.length; i++) {
            znakAscii = (int) tabelaZnakow[i];
            tabelaZnakowAscii[i] = znakAscii;
//            System.out.print(tabelaZnakow[i] + " = " + tabelaZnakowAscii[i] + " , ");
        }
//        System.out.println();
//        InputUtils.liniaOddzielajaca();

        int[] tabelaZnakowAsciiZPrzesunieciem = new int[tabelaZnakow.length];

        for (int i = 0; i < tabelaZnakowAscii.length; i++) {

            if ((tabelaZnakowAscii[i] >= 65) && (tabelaZnakowAscii[i] <= 90) ) {
                tabelaZnakowAsciiZPrzesunieciem[i] = tabelaZnakowAscii[i] + 32;

            } else if ((tabelaZnakowAscii[i] >= 97) && (tabelaZnakowAscii[i]) <= 122 ) {
                tabelaZnakowAsciiZPrzesunieciem[i] = tabelaZnakowAscii[i] - 32;

            } else {
                tabelaZnakowAsciiZPrzesunieciem[i] = tabelaZnakowAscii[i];
            }
        }

        char[] tabelaZnakowPoSzyfrowaniu = new char[tabelaZnakow.length];

        for (int i = 0; i < tabelaZnakowAsciiZPrzesunieciem.length; i++) {

            char znak = (char) tabelaZnakowAsciiZPrzesunieciem[i];
            tabelaZnakowPoSzyfrowaniu[i] = znak;

//            System.out.print(tabelaZnakowAsciiZPrzesunieciem[i] + " = " + tabelaZnakowPoSzyfrowaniu[i] + " , ");
//            System.out.print(tabelaZnakowPoSzyfrowaniu[i] + " = " + tabelaZnakowAsciiZPrzesunieciem[i] + " , ");
        }
//        System.out.println(" ");

        String ciagZnakowPoSzyfrowaniu = "";
        for (int i = 0; i < tabelaZnakowPoSzyfrowaniu.length; i++) {
            ciagZnakowPoSzyfrowaniu += tabelaZnakowPoSzyfrowaniu[i];
        }
            return ciagZnakowPoSzyfrowaniu;
    }

    public static void main(String[] args) {

        String ciagZnakow = InputUtils.pobierzTekst();
        System.out.println("Oryginał: " + ciagZnakow);
        System.out.println("Po zmianie: " + flipCase(ciagZnakow));
    }
}
