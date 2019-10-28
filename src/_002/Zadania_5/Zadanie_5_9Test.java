package _002.Zadania_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie_5_9Test {

    @Test
    void podzielNaSlowa() {

//        dobra wartosc do sprawdzenia
        assertArrayEquals(new String[]{"Ala", "ma","kota"}, Zadanie_5_9.podzielNaSlowa("Ala ma kota"));
        assertArrayEquals(new String[]{"Ala", "ma","kota"}, Zadanie_5_9.podzielNaSlowa("     Ala    ma    kota      "));
        assertArrayEquals(new String[]{"Loerm", "1", "2", "3", "HELLO", "WORL", "D", "!!!"}, Zadanie_5_9.podzielNaSlowa("     Loerm 1 2 3 \n HELLO WORL D !!!    "));
    }

}
