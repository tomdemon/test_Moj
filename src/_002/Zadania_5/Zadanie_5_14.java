//        Napisać funkcję boolean czyAnagram(String t1, String t2) , która sprawdza,
//        czy łańcuch t2 jest anagramem tekstu t1 , czyli czy składa się z tych
//        samych znaków, ale ustawionych niekoniecznie w tej samej kolejności
//        Uwaga, należy sprawdzać jedynie małe i duże litery alfabetu angielskiego, jednak
//        bez względu na ich wielkość, tzn. zarówno małe ’a’ jak i duże ’A’ liczone są tak
//        samo. Pozostałe znaki nie są sprawdzane, a więc nie mają wpływu na to, czy
//        słowo będzie uznane za anagram innego.
//        Przykładowo, dla poniższego fragmentu programu:
//        System.out.println(czyAnagram("kolej", "olejk"));
//        System.out.println(czyAnagram("kolej", "kole"));
//        System.out.println(czyAnagram("kolej", "K O L E J"));
//        System.out.println(czyAnagram("Gregory House", "Huge ego, sorry"));
//        na ekranie powinno zostać wyświetlone:
//        true
//        false
//        true
//        true

package _002.Zadania_5;

import utils.InputUtils;
import java.util.ArrayList;

public class Zadanie_5_14 {

    static boolean czyAnagram(String t1, String t2) {

//        Zamienia na male litery
        String t1MaleLitery = t1.toLowerCase();
        String t2MaleLitery = t2.toLowerCase();
        boolean anagram = true;

        ArrayList<Character> t1Wyczyszczona = new ArrayList<Character>();
        ArrayList<Character> t2Wyczyszczona = new ArrayList<Character>();

//        Wyrzuca zbedne znaki, inni niz od "a" do "z"
        for (int i = 0; i < t1MaleLitery.length(); i++) {

            if (((int) t1MaleLitery.charAt(i) > 96) && ((int) t1MaleLitery.charAt(i) < 123)) {
//                System.out.println("tak: " + t1MaleLitery.charAt(i));
                t1Wyczyszczona.add(t1MaleLitery.charAt(i));
            } else {
//                System.out.println("Nie: " + t1MaleLitery.charAt(i));
            }
        }

        for (int i = 0; i < t2MaleLitery.length(); i++) {

            if (((int) t2MaleLitery.charAt(i) > 96) && ((int) t2MaleLitery.charAt(i) < 123)) {
//                System.out.println("tak: " + t1MaleLitery.charAt(i));
                t2Wyczyszczona.add(t2MaleLitery.charAt(i));
            } else {
//                System.out.println("Nie: " + t2MaleLitery.charAt(i));
            }
        }
//        InputUtils.liniaOddzielajaca();
//        System.out.println(t1Wyczyszczona);
//        System.out.println(t2Wyczyszczona);

//        Sprawdza czy ilosc znakow jest taka sama w t1 i t2
        if (t1Wyczyszczona.size() != t2Wyczyszczona.size()) {
//            System.out.println("Rozna dlugosc porownywanych tresci.");
            anagram = false;
            return anagram;
        }

//      Sprawdza czy anagram

        for (int i = 0; i < t1Wyczyszczona.size(); i++) {
            if (t2Wyczyszczona.indexOf(t1Wyczyszczona.get(i)) == -1) {
                anagram = false;
            }
        }
        return anagram;
    }

    public static void main(String[] args) {

        System.out.println(czyAnagram("kolej", "olejk"));
        System.out.println(czyAnagram("kolej", "kole"));
        System.out.println(czyAnagram("kolej", "K O L E J"));
        System.out.println(czyAnagram("Gregory House", "Huge ego, sorry"));
        InputUtils.liniaOddzielajaca();
        System.out.println(czyAnagram("abcda", "abcd , ,"));
        System.out.println(czyAnagram("aaa,,aaa,,,aaa", "a , ,"));
    }
}
