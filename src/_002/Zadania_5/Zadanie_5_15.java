package _002.Zadania_5;

import org.w3c.dom.ls.LSOutput;
import utils.InputUtils;

import java.util.Arrays;

public class Zadanie_5_15 {

    static int[] HTMLColor2RGB(String color) {

        int[][] tablica = new int[3][2];

        int kolumna = 0;
        int[] wynik = {666, 0, 0};

        for (int i = 1; i < 6; i++) {

            if ((int) color.charAt(i) < 71 && (int) color.charAt(i) > 64) {
                tablica[kolumna][0] = (((int) color.charAt(i)) - 55) * 16;

            } else if ((int) color.charAt(i) < 58 && (int) color.charAt(i) > 47) {
                tablica[kolumna][0] = (((int) color.charAt(i)) - 48) * 16;

            } else {
                tablica[0][0] = 666;
            }

            if ((int) color.charAt(i + 1) < 71 && (int) color.charAt(i + 1) > 64) {
                tablica[kolumna][1] = ((int) color.charAt(i + 1)) - 55;

            } else if ((int) color.charAt(i + 1) < 58 && (int) color.charAt(i + 1) > 47) {
                tablica[kolumna][1] = ((int) color.charAt(i + 1)) - 48;

            } else {
                tablica[0][0] = 666;
            }

            i++;
            kolumna++;
        }

//        Sprawdzenie jak wygladaja dane w tablicy
//        for (int[] a : tablica)
//            for (int b : a)
//                System.out.println(b);

        for (int i = 0; i < wynik.length; i++) {
            wynik[i] = tablica[i][0] + tablica[i][1];
        }

        return wynik;
    }


    public static void main(String[] args) {

        String kolorRGB = "";
//        Sprawdza czy '#' jest na początku
        do {
            kolorRGB = InputUtils.pobierzTekstNaDuzeLitery("Podaj kolor w postaci lancucha #RRGGBB np. #25FF25 (w kodzie szesnastkowym): ");
        } while (kolorRGB.charAt(0) != '#');

        System.out.print("Wynikiem HTMLColor2RGB(" + kolorRGB + ") powinna byc tablica ");

        int[] wynikKoncowy = HTMLColor2RGB(kolorRGB);

        if (wynikKoncowy[0] > 665) {
            System.out.println("Bledne dane");
        } else {
            System.out.print("{ " + wynikKoncowy[0] + " " + wynikKoncowy[1] + " " + wynikKoncowy[2] + " }.");
        }
    }

}
