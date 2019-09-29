package _002.Zadania_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie_5_4Test {

    Zadanie_5_4 obiekt;

    @Test
    void flipCase() {

//        dobra wartosc
        assertEquals("ABCD abcd !@#$%^&*()_+", obiekt.flipCase("abcd ABCD !@#$%^&*()_+"));
//        zle wartosci
        assertEquals("abcd ABCD !@#$%^&*()_+", obiekt.flipCase("abcd ABCD !@#$%^&*()_+"));
    }

}