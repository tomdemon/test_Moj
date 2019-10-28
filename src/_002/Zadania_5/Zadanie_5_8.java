//        Napisać funkcję int wordCount(String text) , której wynikiem jest liczba wszystkich
//        słów występujących w podanym jako parametr tekście. Do sprawdzania, czy
//        dany znak tekstu jest „białym znakiem” można zastosować metodę
//        Character.isWhitespace . Za słowo przyjmujemy każdy ciąg znaków niezawierający
//        białego znaku.


package _002.Zadania_5;

import utils.InputUtils;

import java.util.StringTokenizer;

public class Zadanie_5_8 {


    public static int wordCount(String text) {

        // usunalem delimeter, bo defaultowo StringTokenizer juz uzywa wszystkich bialych znakow
        StringTokenizer tabelaZeSlowami = new StringTokenizer(text);

        // StringSokenizer ma juz metode, ktora zlicza slowa :)
        return tabelaZeSlowami.countTokens();
    }

    //Probowalem zliczac slowa przez petle fori albo String.split ale problem wystepowal albo przy kilku spacjach
    // (ktore zliczal), albo przy spacji na koncu lub poczatku.
    //Ale znalazlem w sieci StringTokenizer i wyniki sa OK ale nie bardzo rozumiem jak to dziala :), szczegolnie przy petli WHILE
    // dlaczego z sout dziala a bez tego nie chce, przeciez to tylko wydruk ?

    /*
    while (tabelaZeSlowami.hasMoreTokens()) {
        tabelaZeSlowami.nextToken();
        iloscSlow++;
    }
    return iloscSlow;

    Popatrzmy jak dziala petla while
    za kazdym przejsciem sprawdza czy wartosc w nawiasach jest true
    jesli tak, to wykonuje blok jeszcze raz

    Jak sprawdza to wywoluje metode `tabelaZeSlowami.hasMoreTokens()`
    W ciele mowisz: "Ej, StringTokenizer, wez pobierz nastepny token"
    Potem cialo sie konczy i wraca znowu do sprawdzenia warunku
    Teraz token juz juz inny, albo juz nie ma kolejnych
     */


    public static void main(String[] args) {

        String zdanie = InputUtils.pobierzTekstNaMaleLitery();
        InputUtils.liniaOddzielajaca();
        System.out.println("Liczba słow w tekście to : " + wordCount(zdanie));

    }
}
