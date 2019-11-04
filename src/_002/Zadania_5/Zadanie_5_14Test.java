package _002.Zadania_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie_5_14Test {

    @Test
    void czyAnagram() {

//        dobra wartosc do sprawdzenia
        assertEquals(true, Zadanie_5_14.czyAnagram("kolej", "olejk"));
        assertEquals(false, Zadanie_5_14.czyAnagram("kolej", "kole"));
        assertEquals(true, Zadanie_5_14.czyAnagram("kolej", "K O L E J"));
        assertEquals(true, Zadanie_5_14.czyAnagram("Gregory House", "Huge ego, sorry"));
        assertEquals(false, Zadanie_5_14.czyAnagram("aaa,,aaa,,aaa,,aaa", "a"));


        assertNotEquals(false, Zadanie_5_14.czyAnagram("kolej", "olejk"));
    }

}