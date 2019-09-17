//Napisz program, który sprawdzi, czy w podanym przez uzytkownika wyrazeniu
//        arytmetycznym nawiasy sa poprawnie sparowane. Wyrazenie podawane jest jako
//        pojedynczy łancuch znaków. Program powinien wyswietlic stosowny komunikat.
//            "OK" lub "Bładne sparowanie wyników"


package _002.Zadania_4;

import java.util.Scanner;

public class Zadanie_4_5 {

    public static void liniaOddzielajaca () {
        System.out.println("---------------------------------");
    }

    public static String  pobierzCiagZnakow() {

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Proszę podać równanie matematyczne : ");
        String ciagZnakow;

        ciagZnakow = scanner.nextLine();
        return ciagZnakow;
    }

    public static void main(String[] args) {

       String rownanieMatematyczne =  pobierzCiagZnakow();
       liniaOddzielajaca();

        System.out.println("Znaki wrzucono w tabelę: ");


        char[] tabelaZnakow = rownanieMatematyczne.toCharArray();
        for (char znak : tabelaZnakow) {
            System.out.print(znak + " ");
        }

        System.out.println("");

        liniaOddzielajaca();

        int sumaNawiasowLewych = 0;
        int sumaNawiasowPrawych = 0;

        for (int i = 0; i < tabelaZnakow.length; i++) {

          switch (tabelaZnakow[i]){
              case '(' : {
                  sumaNawiasowLewych += 1;
                  break;
              }
              case ')' : {
                  sumaNawiasowPrawych += 1;
                  break;
              }
              default:;
         }
//          Sprawdzanie ilości nawiasów zamykających. Od razu rozwiązuje problem z nawiasem zamykającym na początku,
//            linijkę 81 mozna przerobic by tylko sprawdzalo czy na koncu nei ma nawiasu otwierajacego,
//            ale na wszelki wypadek i dla przejrzystosci kodu zostawilem by sprawdzalo przod i tyl :)

         if (sumaNawiasowPrawych > sumaNawiasowLewych) {
             System.out.println("Za dużo nawiasów zamykających");
             break;
         }

        }

//        System.out.println("ilość nawiasów lewych : " + sumaNawiasowLewych);
//        System.out.println("ilość nawiasów pawych : " + sumaNawiasowPrawych);
//        liniaOddzielajaca();


        if (sumaNawiasowLewych == sumaNawiasowPrawych) {
            for (int i = 0; i < tabelaZnakow.length; i++) {

//                sprawdzenie czy zamknięcie nawiasu jest na początku

                if (')' == tabelaZnakow[i]) {
                    System.out.println("Sparowanie nawiasów OK, ale nawias końcowy jest na początku.");
                    System.out.println("Błąd");
                    break;
                } else {
                    for (int j = (tabelaZnakow.length - 1); j > 0 ; j--) {

//                        sprawdzenie czy nawiazu otwierającego nie ma na końcu

                        if ('(' == tabelaZnakow[j]) {
                            System.out.println("Sparowanie nawiasów OK, ale nawias otwierający jest na końcu.");
                            System.out.println("Błąd");
                            break;
                        }
                        else {
                            System.out.println("OK. Prawidłowe sparowanie nawiasów.");
                            break;
                        }
                    }
                    break;
                }
            }
        }
        else {
                System.out.println("Błędne sparowanie nawiasów.");
            }
    }
}
