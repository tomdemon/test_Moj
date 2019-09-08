package test2;
import java.util.Scanner;





public class Main1 {

    public static int pobierzLiczbę() {

        Scanner scanner = new Scanner(System.in);

        int liczba;

        do {
            System.out.println ("Proszę podać liczbę : ");
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

        int n;
        n = pobierzLiczbę();
        int[] tabela1D = new int[n];

       for (int i = 0; i < n; i++) {
            tabela1D[i] = n - i;
            System.out.println(tabela1D[i]);
        }
    }
}
