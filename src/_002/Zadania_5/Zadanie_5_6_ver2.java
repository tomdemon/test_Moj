package _002.Zadania_5;

import java.util.Scanner;

public class Zadanie_5_6_ver2 {
    public static void liniaOddzielajaca() {
        System.out.println("---------------------------------");
    }

    public static String pobierzTekst() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proszę podaj ciag znakow : ");
        String pobierzTekst;
        pobierzTekst = scanner.nextLine();
        return pobierzTekst;
    }

    static String str;
    static char z;


    public static void szukaniePierwszegoZnaku(String str1) {
//        System.out.println("Dlugosc str1: " + str1.length());
        if (str1.charAt(0) == '+') {
        } else if ((str1.charAt(0) == '-') || (str1.charAt(0) == '0') || (str1.charAt(0) == '1') ||
                (str1.charAt(0) == '2') || (str1.charAt(0) == '3') || (str1.charAt(0) == '4') || (str1.charAt(0) == '5') ||
                (str1.charAt(0) == '6') || (str1.charAt(0) == '7') || (str1.charAt(0) == '8') || (str1.charAt(0) == '9')) {
            System.out.println("0 - " + str1.charAt(0));
        } else {
            System.out.println("Blad. Pierwszy znak nie spelnia kryteriow");
        }
    }

    public static void szukanieTylkoCyfr(String str2, int x) {
//        System.out.println("Dlugosc str2: " + str2.length());
        if ((str2.charAt(x) == '0') || (str2.charAt(x) == '1') || (str2.charAt(x) == '2') || (str2.charAt(x) == '3') ||
                (str2.charAt(x) == '4') || (str2.charAt(x) == '5') || (str2.charAt(x) == '6') || (str2.charAt(x) == '7') ||
                (str2.charAt(x) == '8') || (str2.charAt(x) == '9')) {
//            System.out.println(x + " - " + str2.charAt(x));
            System.out.print(str2.charAt(x));
        } else {
            System.out.println("Blad. Pierwszy znak nie spelnia kryteriow");
        }
    }

    public static boolean szukanieTylkoCyfrILiteraE(String str3, int x) {
//        System.out.println("Dlugosc str3: " + str3.length());
        if ((str3.charAt(x) == '0') || (str3.charAt(x) == '1') || (str3.charAt(x) == '2') || (str3.charAt(x) == '3') ||
                (str3.charAt(x) == '4') || (str3.charAt(x) == '5') || (str3.charAt(x) == '6') || (str3.charAt(x) == '7') ||
                (str3.charAt(x) == '8') || (str3.charAt(x) == '9')) {
//            System.out.println(x + " - " + str3.charAt(x));
            System.out.print(str3.charAt(x));
            return true;
        } else if (str3.charAt(x) == 'e') {
            System.out.print("*10^");
            return true;
        }
        return false;
    }

    public static int strToInt(String str) {

//        System.out.println("!!! "+ str.length());
        int dlugosc = str.length();

        if (dlugosc == 1) {
            szukanieTylkoCyfr(str, 0);
//            System.out.println("Dlugosc dla: 1: " + dlugosc);
            return 0;
        } else if (dlugosc == 2) {
//            System.out.println("Dlugosc dla 2: " + dlugosc);
            if (str.charAt(0) == '-') {
                System.out.print(str.charAt(0));
//                System.out.println("0  - " + str.charAt(0));
            } else if (str.charAt(0) == '+') {
            } else {
                szukanieTylkoCyfr(str, 0);
            }
            szukanieTylkoCyfr(str, 1);
        } else if (dlugosc > 2) {
//            System.out.println("hurra jest wiecej niz 2 znaki: " + str.length());

            if (str.charAt(0) == '-') {
                System.out.print(str.charAt(0));
//                System.out.println("0  - " + str.charAt(0));
            } else if (str.charAt(0) == '+') {
            } else {
                szukanieTylkoCyfr(str, 0);
            }
            if (str.charAt(0) == 'e') {
                return 0;
            } else {
                szukanieTylkoCyfr(str, 1);
            }
            for (int i = 2; i < str.length(); i++) {
                boolean czyDobrze = szukanieTylkoCyfrILiteraE(str, i);
//                System.out.println(czyDobrze);
                if (czyDobrze == false) {
                    System.out.println("Zły znak");
                    break;
                }

            }

        }

        return 0;
    }


    public static void main(String[] args) {

        String pobranyTekst = pobierzTekst();
        liniaOddzielajaca();
        strToInt(pobranyTekst);

    }
}
