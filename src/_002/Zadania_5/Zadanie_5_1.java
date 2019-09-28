//        1. Napisz funkcję, która zwraca wartość silni dla podanej liczbyn.
//        Funkcja powinnabyć napisana w dwóch wersjach: iteracyjnej i rekurencyjnej.


package _002.Zadania_5;

import utils.InputUtils;

public class Zadanie_5_1 {

    public long silniaIteracyjna(long n) {
        long silnia = 1L;
        while (n > 0) {
            silnia = silnia * n;
            n--;
        }
        return silnia;
    }

    public long silniaRekurencyjna(long n) {
        if (n > 0) {
            return n * silniaRekurencyjna(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Zadanie_5_1 r = new Zadanie_5_1();
        long iteracja, rekurencja = 0L;

        long liczba = InputUtils.pobierzLiczbe();
//        System.out.println("Liczba wynosi " + liczba);
        iteracja = r.silniaIteracyjna(liczba);
        rekurencja = r.silniaRekurencyjna(liczba);

        System.out.println(liczba + " silnia w iteracji wynosi: " + iteracja);
        System.out.println(liczba + " silnia w rekurencji wynosi: " + rekurencja);
    }

 }
