package test2;
import java.util.Scanner;


public class Main4 {

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
        System.out.println ("Pobrano : ");

        System.out.println(ciagZnakow2);

        liniaOddzielajaca();

        String ciagZnakow3 = ciagZnakow2.toLowerCase();

        liniaOddzielajaca();

        int długoscCiaguZnakow = ciagZnakow3.length();
        System.out.println("Ilość znaków :" + długoscCiaguZnakow);

        liniaOddzielajaca();
        System.out.println("Znaki wrzucono w tabelę:");


        char[] tabelaZnakow = ciagZnakow3.toCharArray();
        for (char znak : tabelaZnakow) {
            System.out.print(znak + " ");
        }

        System.out.println("");
        liniaOddzielajaca();
        System.out.println("Znajdowanie ostatniego znaku.");

        char ostatniZnak = tabelaZnakow [długoscCiaguZnakow - 1];
        System.out.println("Ostatni znak to: " + ostatniZnak);


        liniaOddzielajaca();
        System.out.println("Sprawdzenie ile jest Ostatnich znaków w ciagu.");

        int iloscOstatnichZnakow = 0;

        for (int i = 0; i < tabelaZnakow.length; i++) {

            if (tabelaZnakow[i] == ostatniZnak) {
                iloscOstatnichZnakow++;
            }
        }
        System.out.println("Ilość ostatnich znaków to : " + iloscOstatnichZnakow);

        System.out.println("Program sumuje już wielkie i małe litery :).");

        liniaOddzielajaca();


    }

}
