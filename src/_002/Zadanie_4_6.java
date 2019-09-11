//        Napisz program, który umozliwia szyfrowanie podanego ciagu znaków przy uzy-
//        ciu szyfru Cezara, który jest szczególnym przypadkiem szyfru podstawieniowego
//        monoalfabetycznego.
//        Uzytkownik program podaje tekst do zaszyfrowania oraz liczbe n, o która prze-
//        suniety jest alfabet za pomoca którego szyfrujemy tekst. Dla uproszczenia mozna
//        przyjac, ze łanuch wejsciowy składa sie tylko z małych liter alfabetu angielskiego,
//        tj. ’a’ – ’z’ (26 znaków) oraz spacja

package _002;

import java.util.Scanner;

public class Zadanie_4_6 {


    public static void liniaOddzielajaca () {
        System.out.println("---------------------------------");
    }


    public static int przelicznikSumy(int suma1) {
        int koncowka;
//           System.out.println("początek suma1 = " + suma1);
        if (suma1 > 25) {
//            System.out.print(suma1 + " % 26 = ");
            koncowka = suma1 % 26;
//            System.out.println(koncowka);
            suma1 = koncowka;
//             System.out.println("koniec suma1 =  " + suma1);
//            System.out.println();
            return suma1;
        } else if (suma1 < 0) {
            koncowka = suma1 % 26;
//            System.out.println("Końcówka : " + koncowka);
            suma1 = 26 + (koncowka);
            if (suma1 == 26) {
                suma1 = 0;
            }
//            System.out.println("26 + " + koncowka + " = " + suma1);
//            System.out.println();
            return suma1;
        } else {
//            System.out.println("suma1 (dla = 0) = " + suma1);
//            System.out.println();
            return suma1;}
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Proszę podać łańcuch znaków do zaszyfrowania : ");

        String ciagZnakow = scanner.nextLine();

        System.out.println("Proszę podać przesunięcie : ");

        int przesuniecie = scanner.nextInt();

        liniaOddzielajaca();

        System.out.println(ciagZnakow + " " + przesuniecie);

        liniaOddzielajaca();

        System.out.println("Znaki wrzucono w tabelę: ");

        String ciagZnakowMaleLitery = ciagZnakow.toLowerCase();


        char[] tabelaZnakow = ciagZnakowMaleLitery.toCharArray();
        for (char znak : tabelaZnakow) {
            System.out.print(znak + " ");
        }
        System.out.println("");
        liniaOddzielajaca();

//        " " 0, a 1, b 2, c 3, d 4, e 5, f 6, g 7, h 8, i 9, j 10, k 11, l 12, m 13, n 14, o 15, p 16, r 17, s 18, t 19, u 20,
//        w 21, v 22, x 23, y 24, z 25,
        char[] alfabet = new char[]{' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'w', 'v', 'x', 'y', 'z'};
        System.out.println("Wzór : ");
        System.out.println(alfabet);
        liniaOddzielajaca();

//        System.out.println("Szyfrowanie : ");


        int x = 0;
        int suma = 0;


        for (int i = 0; i < tabelaZnakow.length; i++) {
            switch (tabelaZnakow[i]) {
                case ' ': {
                    suma = przesuniecie;
//                    System.out.println("początek suma ( ) = " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];

//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'a': {
                    suma = 1 + przesuniecie;
//                    System.out.println("początek suma (a) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'b': {
                    suma = 2 + przesuniecie;
//                    System.out.println("początek suma (b) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'c': {
                    suma = 3 + przesuniecie;
//                    System.out.println("początek suma (c) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'd': {
                    suma = 4 + przesuniecie;
//                    System.out.println("początek suma (d) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'e': {
                    suma = 5 + przesuniecie;
//                    System.out.println("początek suma (e) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'f': {
                    System.out.println("początek suma (f) =  " + suma);

                    suma = przelicznikSumy(suma);
                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
                    System.out.println(tabelaZnakow[i]);
                    System.out.println("---");
                    break;
                }
                case 'g': {
                    suma = 7 + przesuniecie;
//                    System.out.println("początek suma (g) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'h': {
                    suma = 8 + przesuniecie;
//                    System.out.println("początek suma (h) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'i': {
                    suma = 9 + przesuniecie;
//                    System.out.println("początek suma (i) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'j': {
                    suma = 10 + przesuniecie;
//                    System.out.println("początek suma (j) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'k': {
                    suma = 11 + przesuniecie;
//                    System.out.println("początek suma (k) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'l': {
                    suma = 12 + przesuniecie;
//                    System.out.println("początek suma (l) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'm': {
                    suma = 13 + przesuniecie;
//                    System.out.println("początek suma (m) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'n': {
                    suma = 14 + przesuniecie;
//                    System.out.println("początek suma (n) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'o': {
                    suma = 15 + przesuniecie;
//                    System.out.println("początek suma (o) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'p': {
                    suma = 16 + przesuniecie;
//                    System.out.println("początek suma (p) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'r': {
                    suma = 17 + przesuniecie;
//                    System.out.println("początek suma (r) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 's': {
                    suma = 18 + przesuniecie;
//                    System.out.println("początek suma (s) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 't': {
                    suma = 19 + przesuniecie;
//                    System.out.println("początek suma (t) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'u': {
                    suma = 20 + przesuniecie;
//                    System.out.println("początek suma (u) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'w': {
                    suma = 21 + przesuniecie;
//                    System.out.println("początek suma (w) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'v': {
                    suma = 22 + przesuniecie;
//                    System.out.println("początek suma (v) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'x': {
                    suma = 23 + przesuniecie;
//                    System.out.println("początek suma (x) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'y': {
                    suma = 24 + przesuniecie;
//                    System.out.println("początek suma (y) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }
                case 'z': {
                    suma = 25 + przesuniecie;
//                    System.out.println("początek suma (z) =  " + suma);

                    suma = przelicznikSumy(suma);
//                    System.out.println("koniec suma = " + suma);

                    tabelaZnakow[i] = alfabet[suma];
//                    System.out.println(tabelaZnakow[i]);
//                    System.out.println("---");
                    break;
                }

                default:
            }
        }
        System.out.println("Wynik szyfrowania: ");
        System.out.println(tabelaZnakow);

    }
}
