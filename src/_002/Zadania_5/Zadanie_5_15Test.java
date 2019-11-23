package _002.Zadania_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie_5_15Test {

    @Test
    void HTMLColor2RGB() {

//        Zamienia na Duze litery przy pobieraniu tekstu, wiec w tescie trzeba wstawiac Duze litery od razu

        assertArrayEquals(new int[]{255, 255, 255}, Zadanie_5_15.HTMLColor2RGB("#FFFFFF"));
        assertArrayEquals(new int[]{255, 255, 255}, Zadanie_5_15.HTMLColor2RGB("#FFFFFFfffffff"));
        assertArrayEquals(new int[]{16, 0, 1}, Zadanie_5_15.HTMLColor2RGB("#100001"));
        assertArrayEquals(new int[]{26, 161, 26}, Zadanie_5_15.HTMLColor2RGB("#1AA11A"));
        assertArrayEquals(new int[]{16, 0, 1}, Zadanie_5_15.HTMLColor2RGB("#100001"));

    }
}