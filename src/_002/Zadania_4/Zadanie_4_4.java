//        Napisac program, który sumuje cyfry w tekscie podanym przez uzytkownika.
//        Przykład:
//        "Ala ma 1 psa i 2 koty. Jola ma 10 rybek i 2 papugi."
//        Wynik:
//        6



package _002.Zadania_4;
import java.util.Scanner;


public class Zadanie_4_4 {

    public static void liniaOddzielajaca () {
        System.out.println("---------------------------------");
    }

    public static String  pobierzCiagZnakow() {

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Proszę podać ciąg znaków z cyframi : ");
        String ciagZnakow;

        ciagZnakow = scanner.nextLine();
        return ciagZnakow;
    }

    public static void main(String[] args) {

        String ciagZnakow2 = pobierzCiagZnakow();

        liniaOddzielajaca();

        System.out.println("Znaki wrzucono w tabelę: ");


        char[] tabelaZnakow = ciagZnakow2.toCharArray();
        for (char znak : tabelaZnakow) {
            System.out.print(znak + " ");
        }

        System.out.println("");

        liniaOddzielajaca();
        int suma = 0;

        for (int i = 0; i < tabelaZnakow.length; i++) {

            switch (tabelaZnakow[i]){
                case '1' : {
                    suma += 1;
                    break;
                }
                case '2' : {
                    suma += 2;
                    break;
                }
                 case '3' : {
                    suma += 3;
                    break;
                }
                case '4' : {
                    suma += 4;
                    break;
                }
                case '5' : {
                    suma += 5;
                    break;
                }
                case '6' : {
                    suma += 6;
                    break;
                }
                case '7' : {
                    suma += 7;
                    break;
                }
                case '8' : {
                    suma += 8;
                    break;
                }
                case '9' : {
                    suma += 9;
                    break;
                }
                case '0' : {
                    suma += 0;
                    break;
                }
                default:;
            }
        }
        liniaOddzielajaca();
        System.out.println("Suma cyfr wynosi : " + suma);
    }
}
