//        Napisać funkcję int wordCount(String text) , której wynikiem jest liczba wszystkich
//        słów występujących w podanym jako parametr tekście. Do sprawdzania, czy
//        dany znak tekstu jest „białym znakiem” można zastosować metodę
//        Character.isWhitespace . Za słowo przyjmujemy każdy ciąg znaków niezawierający
//        białego znaku.


package _002.Zadania_5;

import utils.InputUtils;

import java.util.StringTokenizer;

public class Zadanie_5_8 {

//    public static int liczbaSłów = 0;

    public static int wordCount(String text) {

        int iloscSlow = 0;

        StringTokenizer tabelaZeSlowami = new StringTokenizer(text, " ");

        while (tabelaZeSlowami.hasMoreTokens()) {
            // dodałęm (String a) bo jak robiłem // z tego sout nizej to program sie zapętlał
            // nie wiem jak znalezc dlugosc tej tabeli wiec zliczalem iloscSlow++, ale samo
            // iloscSlow zawieszala program, musial bys sout lub ten (String a)
            String a = tabelaZeSlowami.nextToken();
//            System.out.println(tabelaZeSlowami.nextToken());
            iloscSlow++;
        }
        return iloscSlow;
    }

    //Probowalem zliczac slowa przez petle fori albo String.split ale problem wystepowal albo przy kilku spacjach
    // (ktore zliczal), albo przy spacji na koncu lub poczatku.
    //Ale znalazlem w sieci StringTokenizer i wyniki sa OK ale nie bardzo rozumiem jak to dziala :), szczegolnie przy petli WHILE
    // dlaczego z sout dziala a bez tego nie chce, przeciez to tylko wydruk ?


    public static void main(String[] args) {

        String zdanie = InputUtils.pobierzTekstNaMaleLitery();
        InputUtils.liniaOddzielajaca();
        System.out.println("Liczba słow w tekście to : " + wordCount(zdanie));

    }
}
