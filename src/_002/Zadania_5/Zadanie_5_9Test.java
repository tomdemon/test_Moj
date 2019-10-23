package _002.Zadania_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie_5_9Test {

    Zadanie_5_9 obiekt;

    @Test
    void podzielNaSlowa() {

//        dobra wartosc do sprawdzenia
        assertEquals("Ala", obiekt.podzielNaSlowa("Ala ma kota"));
//        assertEquals(3, obiekt.podzielNaSlowa("     Ala    ma    kota      "));

        //        zle wartosci do sprawdzenia
//        assertEquals(0, obiekt.podzielNaSlowa("Ala ma kota"));

    }

}