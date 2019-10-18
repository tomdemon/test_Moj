//        Zdefiniować funkcję int strpos(String text, char z) , która zwraca indeks
//        na którym znajduje się znak z (drugi parametr) w podanym łańcuchu text .
//        Jeżeli znak z nie występuje w łańcuchu, to wynikiem funkcji powinno być -1.
//        Uwaga - pozycje znaków numerujemy począwszy od 0.


package _002.Zadania_5;

import utils.InputUtils;

public class Zadanie_5_3 {

    public int strpos(String text, char z) {
//        System.out.println("Znaki wrzucono w tabelę: ");
        char[] tabelaZnakow = text.toCharArray();
        for (char znak : tabelaZnakow) {
//            System.out.print(znak + " ");
        }
//        System.out.println("");
//        InputUtils.liniaOddzielajaca();

        for (int i = 0; i < tabelaZnakow.length; i++) {

            if (tabelaZnakow[i] == z) {
//                System.out.println("Miejsce litery '" + z + "' jest nr " + i);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String pobranyTekst = InputUtils.pobierzTekst("Proszę podać tekst:");
        char pobranaLitera = InputUtils.pobierzLitere();

//        liniaOddzielajaca();

//        System.out.println("Tekst: " + pobranyTekst);
//        System.out.print("Litera: ");
//        System.out.println(pobranaLitera);

//        liniaOddzielajaca();

        Zadanie_5_3 obiekt = new Zadanie_5_3();

        System.out.println(obiekt.strpos(pobranyTekst, pobranaLitera));

    }
}
