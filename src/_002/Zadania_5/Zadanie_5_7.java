//        Zdefiniować funkcję int strfind(String gdzie, String co) , która szuka łańcucha
//        co w łańcuchu gdzie i jeżeli go znajdzie, to jej wynikiem jest pozycja,
//        na której ten łańcuch zaczyna się w łańcuchu gdzie . Jeżeli nie udało się znaleźć
//        łańcucha to wtedy wynikiem ma być -1.
//        Przykłady:
//        strfind("Ala ma kota", "ma") - wynik to 4
//        strfind("Ala ma kota", "Ala ma kota") - wynik to 0
//        strfind("Ala ma kota", "") - wynik to 0, bo pusty łańcuch jest
//        podłańcuchem każdego innego łańcucha
//        strfind("Pies", "jakis napis") - wynik to -1
//        strfind("Ala ma kota", "pies") - wynik to -1


package _002.Zadania_5;

import utils.InputUtils;

public class Zadanie_5_7 {

    public static int strfind(String gdzie, String co) {

        boolean czyJest = gdzie.contains(co);
        if (czyJest) {
            return gdzie.indexOf(co);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        String pobraneGdzie = InputUtils.pobierzTekstNaNaleLitery("Podaj gdzie będziemy szukać : ");
        String pobraneCo = InputUtils.pobierzTekstNaNaleLitery("Podaj co będziemy szukać : ");

        InputUtils.liniaOddzielajaca();

        System.out.println("Wynik to : " + strfind(pobraneGdzie, pobraneCo));
    }
}
