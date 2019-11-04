//        Napisać program, który wykorzystując część z zaimplementowanych wcześniej
//        funkcji wyznacza:
//        • Sumę wszystkich liczb znajdujących się w tablicy (jako liczbę traktuje się
//        łańcuch, którego początkiem jest liczba - format jak w funkcji strToInt().
//        • Łańcuch będący połączeniem wszystkich komórek tablicy, których wartość
//        łańcucha nie jest liczbą (definicja liczby analogiczna do pkt. 1).
//        • Liczbę wystąpień określonej frazy we wszystkich komórkach „nieliczbowych”
//        tablicy.
//        • Liczbę wystąpień określonej frazy w łańcuchu, o którym mowa w pkt. 2.
//        • Stosunek wystąpień frazy w komórkach tablicy (pkt. 3) do liczby wystąpień
//        w powstałym łańcuchu (pkt. 4).
//        Przykład:
//        Tablica, o której mowa w zadaniu:
//        zadania[N][M]={"mamla", " mama ", "+12", "0001", "991-234-3",
//        "-12e5", "-12e-5", "+zonmakm", "ax2", "amakotma"};
//      // gdzie N=M=10;
//        Szukana fraza:
//        f[N]="ma";
//        Wynik wyświetlony na konsolę:
//        Pkt. 1: -1199008 (980 w moim [przypadku bez "e"]
//        Pkt. 2: mamla mama +zonmakmax2amakotma
//        Pkt. 3: 6
//        Pkt. 4: 7
//        Pkt. 5: 0.857143

package _002.Zadania_5;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Zadanie_5_12 {



    public static Result getResult(String[] zadania, String szukanaFraza) {
        // tutaj zwroc obiekt typu Result z odpowiednimi wartosciami
        // i staraj sie reuzyc rozwiazan z poprzednich zadanek
        return null;
    }

    static class Result {
        int numbersSum;
        String notANumberConcatenatedArray;
        int phraseOccuranceInNotANumberCells;
        int phraseOccuranceAll;
        float phraseOccuranceRatio;

        @Override
        public String toString() {
            return new StringJoiner(", ", Result.class.getSimpleName() + "[", "]")
                    .add("numbersSum=" + numbersSum)
                    .add("notANumberConcatenatedArray='" + notANumberConcatenatedArray + "'")
                    .add("phraseOccuranceInNotANumberCells=" + phraseOccuranceInNotANumberCells)
                    .add("phraceOccuranceAll=" + phraseOccuranceAll)
                    .add("phraceOccuranceRatio=" + phraseOccuranceRatio)
                    .toString();
        }
    }


    public static void main(String[] args) {

        String[] zadania = {"mamla", " mama ", "+12", "0001", "991-234-3", "-12e5", "-12e-5", "+zonmakm",
                "ax2", "amakotma"};
        String szukanaFraza = "ma";
        String lancuchZNieLiczb = "";
        ArrayList<Integer> listaLiczb = new ArrayList<Integer>();
        ArrayList<String> listaSlow = new ArrayList<String>();


        for (int i = 0; i < zadania.length; i++) {

            int liczba = 0;

//            Sprawdza tylko cyfry

            if (((int) zadania[i].charAt(0) > 47) && ((int) zadania[i].charAt(0) < 58)) {
                String slowo = zadania[i];
                for (int j = 0; j < zadania[i].length(); j++) {
                    if (((int) zadania[i].charAt(j) > 47) && ((int) zadania[i].charAt(0) < 58)) {
//                        System.out.println("Litera : " + (Character.getNumericValue(zadania[i].charAt(j))));
                        liczba = (liczba * 10) + (Character.getNumericValue(zadania[i].charAt(j)));
                    } else {
                        break;
                    }
                }
                listaLiczb.add(liczba);
//                System.out.println(listaLiczb);
//                System.out.println("Liczby: " + zadania[i].charAt(0));
//                System.out.println(zadania[i] + " = " + liczba);

//                Sprawdza tylko "+" i "-"

            } else if ((zadania[i].charAt(0) == '-') || (zadania[i].charAt(0) == '+')) {
//                System.out.println("Minus lub plus: " + zadania[i].charAt(0));
                if (((int) zadania[i].charAt(1) > 47) && ((int) zadania[i].charAt(1) < 58)) {
                    for (int j = 1; j < zadania[i].length(); j++) {
                        if (((int) zadania[i].charAt(j) > 47) && ((int) zadania[i].charAt(j) < 58)) {
//                            System.out.println("Cyfra : " + zadania[i].charAt(j));
//                            System.out.println("Cyfra : " + (Character.getNumericValue(zadania[i].charAt(j))));
                            liczba = (liczba * 10) + (Character.getNumericValue(zadania[i].charAt(j)));
//                            System.out.println("Liczba wynosi: " + liczba);

                        } else {
                            break;

                        }

//                        System.out.println(zadania[i].charAt(j));
                    }
                    if (zadania[i].charAt(0) == '-') {
                        liczba = liczba * (-1);
                        listaLiczb.add(liczba);

                    } else {
                        listaLiczb.add(liczba);
                    }

                } else {
                    lancuchZNieLiczb = lancuchZNieLiczb + zadania[i];
//                    System.out.println(zadania[i].charAt(1));
                    listaSlow.add(zadania[i]);
                }


//                Sprawdza tylko "nie liczby"
            } else {
                listaSlow.add(zadania[i]);
                lancuchZNieLiczb = lancuchZNieLiczb + zadania[i];

//                System.out.println("Nie liczby: " + zadania[i].charAt(0));
            }
        }

        int sumaLiczb = 0;
        for (int liczba : listaLiczb) {
            sumaLiczb = sumaLiczb + liczba;
        }
//      Pkt. 1 Zrobilem bez "e" bo to mocno skomplikuje program, a Zadanie 5.6, w ktorym to sie uzywa jeszcze nie skonczylem

        System.out.println("Pkt. 1: " + listaLiczb + " = " + sumaLiczb);
        System.out.println("Pkt. 2: " + lancuchZNieLiczb);

        int sumaFraz = 0;
        int cyfra2 = 0;
        for (int i = 0; i < listaSlow.size(); i++) {
            cyfra2 = Zadanie_5_10.strFindAndCount(listaSlow.get(i), szukanaFraza);
            sumaFraz = sumaFraz + cyfra2;
        }

        System.out.println("Pkt. 3: " + sumaFraz);

        int sumaFraz2 = Zadanie_5_10.strFindAndCount(lancuchZNieLiczb, szukanaFraza);
        System.out.println("Pkt. 4: " + sumaFraz2);
//        System.out.println(listaSlow);

        float sumaFrazF = sumaFraz;
        float sumaFraz2F = sumaFraz2;

        System.out.println("Pkt. 5: " + (sumaFrazF / sumaFraz2F));

    }
}
