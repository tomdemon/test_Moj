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

import java.util.Scanner;

public class Zadanie_5_5 {


    public static void liniaOddzielajaca() {
        System.out.println("---------------------------------");
    }

    static boolean startWith (String str1, String str2){

        if (str1.equals(str2)){
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Prosze podac lancuch znakow : ");

        String ciagZnakow = scanner.nextLine();

        System.out.println("Prosze podac prefiks : ");

        String prefiks = scanner.nextLine();

        liniaOddzielajaca();

        int iloscZnakowWPrefiksie = prefiks.length();

        if (ciagZnakow.length() > prefiks.length()) {

            String ciagZnakowPrefiks = ciagZnakow.substring(0, iloscZnakowWPrefiksie);
//        System.out.println(prefiks + " = " + ciagZnakowPrefiks);

            startWith(prefiks, ciagZnakowPrefiks);
        } else {
            System.out.println("Blad. Lancuch znakow jest krotszy od prefiksu.");
        }

    }
}
