//        Napisać funkcję String[] podzielNaSlowa(String tekst) , która dzieli podany
//        tekst na słowa i zapisuje je w tablicy. Wynikiem funkcji jest tablica zawierające
//        kolejno słowa z tekstu. Za słowo przyjmujemy każdy ciąg znaków niezawierający
//        białego znaku.

package _002.Zadania_5;

import utils.InputUtils;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Zadanie_5_9 {

//    public static int liczbaSłów = 0;

    public static String[] podzielNaSlowa(String text) {

        List<String> tokeny = new ArrayList<>();

        StringTokenizer tabelaZeSlowami = new StringTokenizer(text);

        while (tabelaZeSlowami.hasMoreTokens()) {
            tokeny.add(tabelaZeSlowami.nextToken());
        }

        String[] tablicaSlow = new String[tokeny.size()];

        // lista ma metode gdzie przekazujesz tablice o danym rozmiarze i ona sama ja wypenia
        return tokeny.toArray(tablicaSlow);
    }


    public static void main(String[] args) {

        String zdanie = InputUtils.pobierzTekst();
        InputUtils.liniaOddzielajaca();
        System.out.println("Slowa w tablicy to : ");
        String[] slowaWTablicy = podzielNaSlowa(zdanie);
        for (int i = 0; i < slowaWTablicy.length; i++) {
            System.out.println(slowaWTablicy[i]);
        }


    }
}

