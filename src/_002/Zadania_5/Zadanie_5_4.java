//        Napisać funkcję String flipCase(String text) , która zamieni małe litery na
//        duże i odwrotnie w łańcuchu podanym jako parametr. Wynikiem ma być łańcuch
//        znaków zawierający kopię łańcucha po zmianie wielkości liter.

package _002.Zadania_5;

import java.util.Scanner;

public class Zadanie_5_4 {

    public static void liniaOddzielajaca () {
        System.out.println("---------------------------------");
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Proszę podać łańcuch znaków : ");

        String ciagZnakow = scanner.nextLine();

        liniaOddzielajaca();

//        System.out.println("Znaki wrzucono w tabelę: ");

//        String ciagZnakowMaleLitery = ciagZnakow.toLowerCase();

        char[] tabelaZnakow = ciagZnakow.toCharArray();
        for (char znak : tabelaZnakow) {
//            System.out.print(znak + " ");
        }
//        System.out.println("");
        liniaOddzielajaca();

//        System.out.println("Zamiana na znaki ASCII");

        int[] tabelaZnakowAscii = new int[tabelaZnakow.length];
        int znakAscii;

        for (int i = 0; i < tabelaZnakow.length; i++) {
            znakAscii = (int) tabelaZnakow[i];
            tabelaZnakowAscii[i] = znakAscii;
            System.out.print(tabelaZnakow[i] + " = " + tabelaZnakowAscii[i] + " , ");
        }
        System.out.println(" ");
//        liniaOddzielajaca();

        int[] tabelaZnakowAsciiZPrzesunieciem = new int [tabelaZnakow.length];

        for (int i = 0; i < tabelaZnakowAscii.length; i++) {

            if (tabelaZnakowAscii[i] == 32) {
                tabelaZnakowAsciiZPrzesunieciem[i] = tabelaZnakowAscii[i];
//                System.out.println("dla 32 =  " + tabelaZnakowAsciiZPrzesunieciem[i]);

            } else if (tabelaZnakowAscii[i] <= 96) {
                tabelaZnakowAsciiZPrzesunieciem[i] = tabelaZnakowAscii[i] + 32;
//                System.out.println("dla < 96 = "+ tabelaZnakowAsciiZPrzesunieciem[i]);

            } else {
                tabelaZnakowAsciiZPrzesunieciem[i] = tabelaZnakowAscii[i] - 32;
//                System.out.println("dla > 96 = " + tabelaZnakowAsciiZPrzesunieciem[i]);

            }
        }

        char[] tabelaZnakowPoSzyfrowaniu = new char[tabelaZnakow.length];

        for (int i = 0; i < tabelaZnakowAsciiZPrzesunieciem.length; i++) {

            char znak = (char) tabelaZnakowAsciiZPrzesunieciem[i];
            tabelaZnakowPoSzyfrowaniu[i] = znak;

//            System.out.print(tabelaZnakowAsciiZPrzesunieciem[i] + " = " + tabelaZnakowPoSzyfrowaniu[i] + " , ");
            System.out.print(tabelaZnakowPoSzyfrowaniu[i] + " = " + tabelaZnakowAsciiZPrzesunieciem[i] + " , ");
        }
        System.out.println(" ");
            liniaOddzielajaca();
        System.out.print("Oryginał: ");
        System.out.println(tabelaZnakow);
        System.out.print("Po zmianie: ");
        System.out.println(tabelaZnakowPoSzyfrowaniu);

    }

}
