//Napisz funkcję, która zwraca wartość n-tego wyrazu ciągu Fibonacciego. Funkcja
//        powinna być napisana w dwóch wersjach: iteracyjnej i rekurencyjnej.

package _002;

import java.util.Scanner;

public class Zadanie_5_2 {

    public static long pobierzLiczbe() {

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Proszę podaj, który wyraz ciągu Fibonacciego chcesz znać wartość : ");
        long pobierzLiczbe;
        pobierzLiczbe = scanner.nextInt();
        return pobierzLiczbe;
    }


    public long ciagFibonacciegoIteracyjna (long n){
        long ciagFibonacciego = 1L;
        long ciagFNMinus1 = 1L;
        long ciagFNminus2 = 1L;
        long przejsciowe = 1L;

        if (n == 0) {
            ciagFibonacciego = 0;
//            System.out.println("Dla n = " + n + " ciąg F wynosi: " + ciagFibonacciego);
        } else if (n == 1 || n == 2) {
            ciagFibonacciego = 1;
//            System.out.println("Dla n = " + n + "ciąg F wynosi: " + ciagFibonacciego);
        } else {
            ciagFibonacciego = 1;
            for (int i = 3; i <= n; i++) {
                ciagFibonacciego = ciagFNMinus1 + ciagFNminus2;
                przejsciowe = ciagFNMinus1;
                ciagFNMinus1 = ciagFibonacciego;
                ciagFNminus2 = przejsciowe;
            }
//            System.out.println("Dla n = " + n + "ciąg F wynosi: " + ciagFibonacciego);
        }
        return ciagFibonacciego;
    }

    public long ciagFibonacciegoRekurencyjna (long n) {
        if (n > 2) {
            return ciagFibonacciegoRekurencyjna(n - 1) + ciagFibonacciegoRekurencyjna(n - 2);
        } else if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            System.out.println("zła liczba");
            return 0;
        }
    }

    public static void main(String[] args) {
        Zadanie_5_2 r = new Zadanie_5_2();
        long iteracja, rekurencja = 0L;
//
        long liczba = pobierzLiczbe();
//        System.out.println("Podana liczba wynosi: " + liczba);
        iteracja = r.ciagFibonacciegoIteracyjna(liczba);
        rekurencja = r.ciagFibonacciegoRekurencyjna(liczba);

        System.out.println(liczba + " wyrazem ciągu Fibonacciego w iteracji wynosi: " + iteracja);
        System.out.println(liczba + " wyrazem ciągu Fibonacciego w rekurencji wynosi: " + rekurencja);

    }

}
