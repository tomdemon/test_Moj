package _002.Zadania_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zadanie_5_12Test {

    @Test
    void getResult1() {
        String[] zadania = {"mamla", " mama ", "+12", "0001", "991-234-3", "-12e5", "-12e-5", "+zonmakm",
                "ax2", "amakotma"};
        String fraza = "ma";

        Zadanie_5_12.Result wynik = Zadanie_5_12.getResult(zadania, fraza);

        assertEquals(980, wynik.numbersSum);
        assertEquals("mamla mama +zonmakmax2amakotma", wynik.notANumberConcatenatedArray);
        assertEquals(6, wynik.phraseOccuranceInNotANumberCells);
        assertEquals(7, wynik.phraseOccuranceAll);
        assertEquals(0.85714287, wynik.phraseOccuranceRatio);
    }

    @Test
    void getResult2() {
        // tutaj mozesz sprawdzic z innymi parametrami inne wyniki
        String[] zadania = {"mamla", " mama ", "+12", "0001", "991-234-3", "-12e5", "-12e-5", "+zonmakm",
                "ax2", "amakotma"};
        String fraza = "ma";

        Zadanie_5_12.Result wynik = Zadanie_5_12.getResult(zadania, fraza);

        assertEquals(0, wynik.numbersSum);
        assertEquals("xyz", wynik.notANumberConcatenatedArray);
        assertEquals(0, wynik.phraseOccuranceInNotANumberCells);
        assertEquals(0, wynik.phraseOccuranceAll);
        assertEquals(0, wynik.phraseOccuranceRatio);
    }
}
