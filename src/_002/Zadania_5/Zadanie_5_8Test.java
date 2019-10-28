package _002.Zadania_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie_5_8Test {

    @Test
    void wordCount() {

//        dobra wartosc do sprawdzenia
        assertEquals(3, Zadanie_5_8.wordCount("Ala ma kota"));
        assertEquals(3, Zadanie_5_8.wordCount("     Ala    ma    kota      "));

        // tu ponizej znak "\n" to jest znak reprezentujacy nowa linie
        // Biale znaki to:
        // \n -> nowa linia
        // \t -> tab
        //   -> spacja
        // \r -> microsoft w Windowsie dodaje to przed \n zeby tak reprezentowac nowa linie
        assertEquals(3, Zadanie_5_8.wordCount("Ala \n ma kota"));

        //        zle wartosci do sprawdzenia
        assertNotEquals(0, Zadanie_5_8.wordCount("Ala ma kota"));

    }
}
