package _002.Zadania_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie_5_10Test {
    @Test
    void strFindAndCount() {

//        dobra wartosc do sprawdzenia
        assertEquals(1, Zadanie_5_10.strFindAndCount("Ala ma kota", "ma"));
        assertEquals(7, Zadanie_5_10.strFindAndCount(" ma ma mama mam a mama m a ", "ma"));
        assertEquals(3, Zadanie_5_10.strFindAndCount(" ma ma mama mam a mama m a ", "mam"));
        assertEquals(0, Zadanie_5_10.strFindAndCount(" ma ma mama mam a mama m a ", "ba"));
        assertEquals(1, Zadanie_5_10.strFindAndCount("hello world", "hello world"));
        assertEquals(1, Zadanie_5_10.strFindAndCount("hello world", "world"));

        //        zle wartosci do sprawdzenia
//        assertEquals(6, obiekt.strFindAndCount(" ma ma mama mam a mama m a ", "ma"));

    }

}
