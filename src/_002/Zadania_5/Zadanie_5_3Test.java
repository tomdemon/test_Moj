package _002.Zadania_5;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie_5_3Test {
    Zadanie_5_3 obiekt;

    @Test
    void strpos() {

//        dobre wartosci
        assertEquals(0, obiekt.strpos("alamakota", 'a'));
        assertEquals(-1, obiekt.strpos("alamakota", 'd'));
        assertEquals(1, obiekt.strpos("alamakota", 'l'));
//        błędna wartość
        assertEquals(2, obiekt.strpos("alamakota", 'l'));
    }

}