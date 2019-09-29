package _002.Zadania_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie_5_5Test {

    Zadanie_5_5 obiekt;

    @Test
    void flipCase() {

//        dobra wartosc
        assertEquals(true, obiekt.startWith("Ala", "Ala ma kota"));
        assertEquals(false, obiekt.startWith("ala", "Ala ma kota"));
        assertEquals(true, obiekt.startWith("Ala ma kota", "Ala ma kota"));
        assertEquals(false, obiekt.startWith("kota", "Ala ma kota"));
        assertEquals(false, obiekt.startWith("Ala ma kota", "Ala"));
        assertEquals(true, obiekt.startWith("!@#$%", "!@#$%^"));

//        zle wartosci
        assertEquals(true, obiekt.startWith("kota", "Ala ma  kota"));
    }

}