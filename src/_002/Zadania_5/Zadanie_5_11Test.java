package _002.Zadania_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie_5_11Test {

    Zadanie_5_11 obiekt;

    @Test
    void strcut() {

//        dobra wartosc do sprawdzenia
        assertEquals("Ala kota", obiekt.strcut("Ala ma kota", 4, 3));
        assertEquals("ma kota", obiekt.strcut("Ala ma kota", 0, 4));
        assertEquals("", obiekt.strcut("Ala ma kota", 0, 11));

        //        zle wartosci do sprawdzenia
//        assertEquals("Alakota", obiekt.strcut("Ala ma kota", 4, 3));
    }
}