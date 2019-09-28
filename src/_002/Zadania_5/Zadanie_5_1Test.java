package _002.Zadania_5;

import org.junit.jupiter.api.*;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Zadanie_5_1Test {
    Zadanie_5_1 obiekt;

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each");
        obiekt = new Zadanie_5_1();
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all");
    }

    Map<Long, Long> slownik = Map.of(
            0L, 1L,
            6L, 720L,
            7L, 5040L,
            25L, 7034535277573963776L
    );


    @Test
    void silniaIteracyjna() {
        System.out.println("Silnia iteracyjna");

        for (Map.Entry<Long, Long> entry : slownik.entrySet()) {
            Long oczekiwanaWartosc = entry.getValue();
            Long n = entry.getKey();
            assertEquals(oczekiwanaWartosc, obiekt.silniaIteracyjna(n));
        }
    }

    @Test
    void silniaRekurencyjna() {
        System.out.println("Silnia rekurencyjna");
        for (Map.Entry<Long, Long> entry : slownik.entrySet()) {
            Long oczekiwanaWartosc = entry.getValue();
            Long n = entry.getKey();
            assertEquals(oczekiwanaWartosc, obiekt.silniaRekurencyjna(n));
        }
    }
}
