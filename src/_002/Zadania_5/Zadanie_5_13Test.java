package _002.Zadania_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie_5_13Test {

    Zadanie_5_13 obiekt;

    @Test
    void poprzestawiaj() {
        int[] kolejnosc = {0, 1, 4, 3, 2, 6, 5};
//        dobra wartosc do sprawdzenia
        assertEquals("Egmazni", obiekt.poprzestawiaj("Egzamin", kolejnosc));
        assertEquals("nizamEg", obiekt.poprzestawiaj("nimazgE", kolejnosc));


        //        zle wartosci do sprawdzenia
//        assertEquals("Egzamin", obiekt.poprzestawiaj("Egzamin", kolejnosc));
    }

}