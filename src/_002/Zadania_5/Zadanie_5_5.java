//        Zdefiniować funkcję boolean startsWith(String str1, String str2) , która
//        sprawdza, czy łańcuch str2 jest prefiksem łańcucha str1 .
//        Przykłady:
//        startsWith("Alibaba", "Ali") - wynik true, ponieważ wyraz
//        "Alibaba" zaczyna się wyrazem "Ali".
//        startsWith("Alibaba", "Alibaba") - wynik true, ponieważ wyraz jest
//        zawsze swoim prefiksem.
//        startsWith("Kot", "Pies") - wynik false, ponieważ wyraz "Pies"
//        nie jest prefiksem wyrazu "Kot"

package _002.Zadania_5;

import utils.InputUtils;

import java.util.Scanner;

public class Zadanie_5_5 {


    static boolean startWith (String str1, String str2){

        if (str2.length() >= str1.length()) {

            String ciagZnakowPrefiks = str2.substring(0, str1.length());
//        System.out.println(str1 + " = " + ciagZnakowPrefiks);
            return str1.equals(ciagZnakowPrefiks);

        } else {
            System.out.println("Blad. Lancuch znakow jest krotszy od prefiksu.");
            return false;
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String ciagZnakow = InputUtils.pobierzTekst("Prosze podac lancuch znakow : ");
//        Pozostawilem by roznica w WIELKOSC liter byla bledem

        String prefiks = InputUtils.pobierzTekst("Prosze podac prefiks : ");

        InputUtils.liniaOddzielajaca();

        System.out.println("Wynik: " + startWith(prefiks, ciagZnakow));

    }
}
