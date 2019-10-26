package _002.Zadania_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie_5_10Test {
    Zadanie_5_10 obiekt;

    @Test
    void strFindAndCount() {

//        dobra wartosc do sprawdzenia
        assertEquals(1, obiekt.strFindAndCount("Ala ma kota", "ma"));
        assertEquals(7, obiekt.strFindAndCount(" ma ma mama mam a mama m a ", "ma"));
        assertEquals(3, obiekt.strFindAndCount(" ma ma mama mam a mama m a ", "mam"));
        assertEquals(0, obiekt.strFindAndCount(" ma ma mama mam a mama m a ", "ba"));

        //        zle wartosci do sprawdzenia
//        assertEquals(6, obiekt.strFindAndCount(" ma ma mama mam a mama m a ", "ma"));

    }

}