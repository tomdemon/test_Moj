package _002.Zadania_5;

import java.util.Scanner;

import static java.lang.Math.*;

public class Zadanie_5_6 {

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

    static int sumaCyfr = 0;
    static int prefiks = 0;
    static int cyfra = 0;

    public static int strToInt(String str) {

        if (str.charAt(0) == '-') {
//            System.out.println(str.charAt(0));
//          Sprawdza czy jest na poczatku '-'
            for (int i = 1; i < str.length(); i++) {
                if ((str.charAt(i) == '0') || (str.charAt(i) == '1') || (str.charAt(i) == '2') || (str.charAt(i) == '3') ||
                        (str.charAt(i) == '4') || (str.charAt(i) == '5') || (str.charAt(i) == '6') || (str.charAt(i) == '7')
                        || (str.charAt(i) == '8') || (str.charAt(i) == '9')) {
//                System.out.println(str.charAt(i));
                    cyfra = Character.getNumericValue(str.charAt(i));
                    sumaCyfr = (sumaCyfr * 10) + cyfra;
//                System.out.println(cyfra);
                } else if(str.charAt(i) == 'e'){
                    for (int j = i; j < str.length(); j++) {
                        if ((str.charAt(j) == '0') || (str.charAt(j) == '1') || (str.charAt(j) == '2') || (str.charAt(j) == '3') ||
                                (str.charAt(j) == '4') || (str.charAt(j) == '5') || (str.charAt(j) == '6') || (str.charAt(j) == '7')
                                || (str.charAt(j) == '8') || (str.charAt(j) == '9')) {
                            cyfra = Character.getNumericValue(str.charAt(j));

                            sumaCyfr = sumaCyfr * (int) pow(10, cyfra);
                        }
                    }

                    break;
                }
            }
            sumaCyfr = sumaCyfr * (-1);
//            System.out.println(sumaCyfr);

        } else if (str.charAt(0) == '+') {
//            System.out.println(str.charAt(0));
//            Sprawdza czy na poczatku jest '+'
            for (int i = 1; i < str.length(); i++) {
                if ((str.charAt(i) == '0') || (str.charAt(i) == '1') || (str.charAt(i) == '2') || (str.charAt(i) == '3') ||
                        (str.charAt(i) == '4') || (str.charAt(i) == '5') || (str.charAt(i) == '6') || (str.charAt(i) == '7')
                        || (str.charAt(i) == '8') || (str.charAt(i) == '9')) {
//                System.out.println(str.charAt(i));
                    cyfra = Character.getNumericValue(str.charAt(i));
                    sumaCyfr = (sumaCyfr * 10) + cyfra;
//                System.out.println(cyfra);
                } else {
                    break;
                }


            }
        } else {
//            System.out.println("Ani + ani - w ciagu znakow");
//            Jezeli na poczatku nie ma '+' ani '-'
            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(i) == '0') || (str.charAt(i) == '1') || (str.charAt(i) == '2') || (str.charAt(i) == '3') ||
                        (str.charAt(i) == '4') || (str.charAt(i) == '5') || (str.charAt(i) == '6') || (str.charAt(i) == '7')
                        || (str.charAt(i) == '8') || (str.charAt(i) == '9')) {
//                System.out.println(str.charAt(i));
                    cyfra = Character.getNumericValue(str.charAt(i));
                    sumaCyfr = (sumaCyfr * 10) + cyfra;
//                System.out.println(cyfra);
                } else {
                    break;
                }
            }
        }

        return sumaCyfr;
    }


    public static void main(String[] args) {

        String pobranyTekst = pobierzTekst();
        liniaOddzielajaca();
//        System.out.println(pobranyTekst);
//        strToInt(pobranyTekst);

        System.out.println(strToInt(pobranyTekst));


    }
}
