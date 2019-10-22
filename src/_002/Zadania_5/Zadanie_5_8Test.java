package _002.Zadania_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie_5_8Test {

    Zadanie_5_8 obiekt;

    @Test
    void wordCount() {

//        dobra wartosc do sprawdzenia
        assertEquals(3, obiekt.wordCount("Ala ma kota"));
        assertEquals(3, obiekt.wordCount("     Ala    ma    kota      "));

        //        zle wartosci do sprawdzenia
        assertEquals(0, obiekt.wordCount("Ala ma kota"));

    }
}