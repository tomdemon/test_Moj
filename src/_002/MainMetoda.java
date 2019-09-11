package _002;

import java.util.Scanner;

public class MainMetoda {

    public static void main(String[] args) {

        int[][] ocenyZPrzedniotow = new int[3][4];
        Scanner inputScanner = new Scanner(System.in);

        for (int i = 0; i < ocenyZPrzedniotow.length; i++) {

            for (int j = 0; j < ocenyZPrzedniotow[0].length; j++) {
                System.out.println("Wprowadź " + (j + 1) + " ocenę z " + (i + 1) + " przedmiotu : ");
                ocenyZPrzedniotow[i][j] = inputScanner.nextInt();
            }
        }

        double sumaOcen = 0;

        for (int i = 0; i < ocenyZPrzedniotow.length; i++) {
            for (int j = 0; j < ocenyZPrzedniotow[0].length; j++) {
                sumaOcen += ocenyZPrzedniotow[i][j];
            }
        }

        System.out.println("Srednia ocen wynosi " + (sumaOcen / (ocenyZPrzedniotow.length * ocenyZPrzedniotow[0].length)));
    }


}
