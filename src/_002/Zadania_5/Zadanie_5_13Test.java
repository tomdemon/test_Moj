package _002.Zadania_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie_5_13Test {

    @Test
    void poprzestawiaj() {
        int[] kolejnosc = {0, 1, 4, 3, 2, 6, 5};
//        dobra wartosc do sprawdzenia
        assertEquals("Egmazni", Zadanie_5_13.poprzestawiaj("Egzamin", kolejnosc));
        assertEquals("nizamEg", Zadanie_5_13.poprzestawiaj("nimazgE", kolejnosc));


        //        zle wartosci do sprawdzenia
        assertNotEquals("Egzamin", Zadanie_5_13.poprzestawiaj("Egzamin", kolejnosc));
    }

}