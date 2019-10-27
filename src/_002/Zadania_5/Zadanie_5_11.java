//        Zdefiniować procedurę String strcut(String str, int start, int ile) , która
//        wycina z podanego łańcucha wszystko co znajduje się w podanym zakresie. Wynikiem
//        funkcji powinien być łańcuch bez znaków znajdujących się na pozycjach
//        od start do start+ile-1 .
//        Przykłady:
//        strcut("Ala ma kota", 4, 3) - wynik to "Ala kota"
//        strcut("Ala ma kota", 0, 4) - wynik to "ma kota"
//        strcut("Ala ma kota", 0, 11) - wynik to ""

package _002.Zadania_5;

import utils.InputUtils;

public class Zadanie_5_11 {

    public static String strcut (String str, int start, int ile){

        String pierwszaCzesc = str.substring(0, start);
//        System.out.println(pierwszaCzesc);
        String drugaCzesc = str.substring((start+ile), (str.length()));

//        W zadaniu jest "start do start+ile-1" ale, żeby wynik wyszedl taki jak w zadaniu
//        to uzylem "start do start+ile" (bez -1)

//        System.out.println(drugaCzesc);
        String caleZdaniePoUcieciu = pierwszaCzesc + drugaCzesc;

        return caleZdaniePoUcieciu;
    }


    public static void main(String[] args) {

        String zdanie = InputUtils.pobierzTekst();
        int poczatek = InputUtils.pobierzLiczbeInt("Gdzie zacząć wycinanie ?");
        int dlugosc = InputUtils.pobierzLiczbeInt("Jak dlugi lancuch wyciac ?");
        InputUtils.liniaOddzielajaca();
        System.out.println("Wynik to \"" + strcut(zdanie, poczatek, dlugosc) + "\"");

    }
}
