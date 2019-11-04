//        Zdefiniować funkcję int strFindAndCount(String gdzie, String co) , która
//        zlicza wystąpienia łańcucha co w łańcuchu gdzie . Jej wynikiem jest wyznaczona
//        liczba wystąpień. Jeżeli nie udało się znaleźć łańcucha, to wtedy wynikiem
//        jest, oczywiście, 0.
//        Przykłady:
//        strFindAndCount("Ala ma kota", "ma") - wynik to 1
//        strFindAndCount("mama ma kota", "ma") - wynik to 3
//        strFindAndCount("Ala mmaa ma kota", "ma") - wynik to 2
//        strFindAndCount("Ala ma kota", "Asia") - wynik to 0


package _002.Zadania_5;

import utils.InputUtils;

public class Zadanie_5_10 {

    public static int strFindAndCount(String gdzie, String co) {
        int ileRazy = 0;

        for (int i = 0; i < gdzie.length(); i++) {
            int indeks = gdzie.indexOf(co, i);
//                System.out.println( i + "- indeks: " + indeks);
            if (indeks < 0) {
                return ileRazy;
            }
//                System.out.println("1 - " + i);
            i = indeks + co.length() - 1;
//                System.out.println("2 - " + i);
            ileRazy++;
//                System.out.println("Ile razy: " + ileRazy);
        }
        return ileRazy;
    }

    public static void main(String[] args) {


        String zdanie = InputUtils.pobierzTekst();
        String slowo = InputUtils.pobierzTekst("Podaj \"co\" mamy zliczyć: ");
        InputUtils.liniaOddzielajaca();
        System.out.println("Ilosc wystapien wynosi: " + strFindAndCount(zdanie, slowo));
    }
}
