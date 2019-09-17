//        2. Napisac program, który wczytuje od uzytkownika ciag znaków, a nastepnie two-
//        rzy łancuch bedacy odwróceniem podanego łancucha i wyswietla go na ekranie.
//        Przykładowo, dla łancucha „Kot” wynikiem powinien byc łancuch „toK”.
//
//        3. Napisac program, który wczytuje od uzytkownika ciag znaków, a nastepnie spraw-
//        dza, czy podany ciag jest palindromem.



package _002.Zadania_4;
import java.util.Scanner;

public class Zadanie_4_2i3 {

    public static void liniaOddzielajaca () {

        System.out.println("---------------------------------");
    }

    public static String  pobierzCiagZnakow() {

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Proszę podać ciąg znaków : ");
        String ciagZnakow;

        ciagZnakow = scanner.nextLine();
        return ciagZnakow;

    }

    public static void main(String[] args) {

        String ciagZnakow2 = pobierzCiagZnakow();

        liniaOddzielajaca();
//        System.out.println ("Pobrano : ");

//        System.out.println(ciagZnakow2);


//        liniaOddzielajaca();

        int długoscCiaguZnakow = ciagZnakow2.length();
//        System.out.println("Ilość znaków : " + długoscCiaguZnakow);

//        liniaOddzielajaca();
//        System.out.println("Znaki wrzucono w tabelę: ");

        ciagZnakow2 = ciagZnakow2.replace(" ", "");

        char[] tabelaZnakow = ciagZnakow2.toCharArray();
        for (char znak : tabelaZnakow) {
//            System.out.print(znak + " ");
        }

//        System.out.println("");
//        liniaOddzielajaca();

        for (int i = 0; i < (tabelaZnakow.length / 2); i++) {
            char a1 = tabelaZnakow[i];
            char a2 = tabelaZnakow[tabelaZnakow.length - i -1];

//           System.out.println( a1 + " " + a2);

            tabelaZnakow[i] = a2;
            tabelaZnakow[tabelaZnakow.length - i - 1] = a1;

//            System.out.println( tabelaZnakow[i] + " " + tabelaZnakow[tabelaZnakow.length - i - 1]);
        }

        System.out.println("Wpisane od końca: ");
        System.out.println(tabelaZnakow);

        liniaOddzielajaca();

        int palindrom = 0;

        String ciagZnakow3 = ciagZnakow2.toLowerCase();

        char[] tabelaZnakow2 = ciagZnakow3.toCharArray();

        for (char znak : tabelaZnakow2) {
//            System.out.print(znak + " ");
        }

        for (int i = 0; i < (tabelaZnakow2.length / 2); i++) {
            char a1 = tabelaZnakow2[i];
            char a2 = tabelaZnakow2[tabelaZnakow2.length - i -1];

            if (a1 != a2) {
                palindrom++;
            }
            }

        if (palindrom == 0){
            System.out.println("To jest palindrom");
        }
        else {
            System.out.println("To nie jest palindrom");
        }
    }

}
