//        Napisać funkcję String poprzestawiaj(String tekst, int [] kolejnosc) ,
//        której wynikiem jest łańcuch złożony ze znaków w zmiennej tekst ułożonych wg
//        kolejności podanej w tablicy kolejnosc , tzn. i-ty znak tekstu powinien znaleźć
//        się w wynikowym łańcuchu na pozycji kolejnosc[i] .
//        Przykład, dla poniższego wywołania funkcji:
//        String tekst = "Egzamin";
//        int [] kol = { 0, 1, 4, 3, 2, 6, 5 };
//        System.out.println(poprzestawiaj(tekst, kol));
//        wynikiem powinien być łańcuch:
//        Egmazni

package _002.Zadania_5;

import javax.print.DocFlavor;

public class Zadanie_5_13 {

    static String poprzestawiaj(String text, int[] kolejnosc) {

        String poprzestawiane = "";
        for (int i = 0; i < text.length(); i++) {
            poprzestawiane = poprzestawiane + text.charAt(kolejnosc[i]);
        }
        return poprzestawiane;
    }

    public static void main(String[] args) {

        String tekst = "Egzamin";
        int[] kol = {0, 1, 4, 3, 2, 6, 5};
        System.out.println(poprzestawiaj(tekst, kol));
    }
}
