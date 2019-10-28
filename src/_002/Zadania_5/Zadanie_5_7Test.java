package _002.Zadania_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Zadanie_5_7Test {

    @Test
    void strfind() {

//        dobra wartosc do sprawdzenia
        assertEquals(4, Zadanie_5_7.strfind("Ala ma kota", "ma"));
        assertEquals(0, Zadanie_5_7.strfind("Ala ma kota", "Ala ma kota"));
        assertEquals(0, Zadanie_5_7.strfind("Ala ma kota", ""));
        assertEquals(-1, Zadanie_5_7.strfind("Pies", "jakis pies"));
        assertEquals(-1, Zadanie_5_7.strfind("Ala ma kota", "pies"));

//        zle wartosci do sprawdzenia
        assertNotEquals(0, Zadanie_5_7.strfind("Ala ma kota", "pies"));
    }

}
//        Przykład:
//        strfind("Ala ma kota", "ma") - wynik to 4
//        strfind("Ala ma kota", "Ala ma kota") - wynik to 0
//        strfind("Ala ma kota", "") - wynik to 0, bo pusty łańcuch jest
//        podłańcuchem każdego innego łańcucha
//        strfind("Pies", "jakis napis") - wynik to -1
//        strfind("Ala ma kota", "pies") - wynik to -1
