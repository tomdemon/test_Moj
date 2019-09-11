package _001;
import java.util.Arrays;
import java.util.Scanner;
//import java.net.SocketOption;

public class Main {

     public static void liniaOddzielająca () {

         System.out.println("---------------------------------");
     }







    public static int pobierzLiczbę(int ilość) {

        Scanner scanner = new Scanner(System.in);

        int liczba;

        do {
            System.out.println ("Proszę podać liczbę nr " + ilość + " : ");
            liczba = scanner.nextInt();

            if (liczba > 0 ) {
                return liczba;
            }
            else {
                System.out.println ("Liczba nieprawidlłowa");
            }
        } while (true);
    }





    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        int y;
        int z;

        x = pobierzLiczbę(1);
        y = pobierzLiczbę(2);
        z = pobierzLiczbę(3);


        System.out.println("Twoje liczby to: " + x + " , " + y + " , " + z);


        int[][][] tablicaWielowymiarowa = new int[x][y][z];

        for (int i = 0; i < tablicaWielowymiarowa.length; i++) {

            for (int j = 0; j < tablicaWielowymiarowa[0].length; j++) {

                for (int k = 0; k < tablicaWielowymiarowa[0][0].length; k++) {
                    tablicaWielowymiarowa[i][j][k] = (i * tablicaWielowymiarowa.length) + (j * tablicaWielowymiarowa[0].length) + k;
                    System.out.print(tablicaWielowymiarowa[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();

        }

        liniaOddzielająca();

        System.out.println("Wielkość pierwsza: " + tablicaWielowymiarowa.length);
        System.out.println("Wielkość druga: " + tablicaWielowymiarowa[2].length);
        System.out.println("Wielkość trzecia: " + tablicaWielowymiarowa[0][1].length);

//        for (int[] wiersz: tablicaWielowymiarowa)
//            for (int element: wiersz)
        //              System.out.println(element);
//
        //      int wiersz = 0;
        //        int kolumna = 0;
        //      while (wiersz < tablicaWielowymiarowa.length) {
        //        kolumna = 0;
        //      while (kolumna < tablicaWielowymiarowa[wiersz].length) {
        //        System.out.println(tablicaWielowymiarowa[wiersz][kolumna]);
        //      kolumna++;
        //}
//                wiersz++;
//            }



        liniaOddzielająca();

        System.out.println("Pętla While");

        int indeks = 0;

        while (indeks < tablicaWielowymiarowa.length) {
            System.out.println(Arrays.deepToString(tablicaWielowymiarowa[indeks]));
            indeks++;

            }

        liniaOddzielająca();

           System.out.println("Pętla foreach");

         for (int[][] a : tablicaWielowymiarowa)
             for (int[] b : a)
              for (int element: b)
               System.out.println(element);

        liniaOddzielająca();

    }


}
