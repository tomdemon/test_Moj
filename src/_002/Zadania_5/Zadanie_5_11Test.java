package _002.Zadania_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie_5_11Test {

    @Test
    void strcut() {

//        dobra wartosc do sprawdzenia
        assertEquals("Ala kota", Zadanie_5_11.strcut("Ala ma kota", 4, 3));
        assertEquals("ma kota", Zadanie_5_11.strcut("Ala ma kota", 0, 4));
        assertEquals("", Zadanie_5_11.strcut("Ala ma kota", 0, 11));

        //        zle wartosci do sprawdzenia
        assertNotEquals("Alakota", Zadanie_5_11.strcut("Ala ma kota", 4, 3));
    }
}
