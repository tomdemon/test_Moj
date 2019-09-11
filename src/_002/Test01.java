package _002;

public class Test01 {

    public static void liniaOddzielająca () {

        System.out.println("---------------------------------");
    }



    public static void main(String[] args) {

        int[] tabela1D = {1, 4, 23, 1, 6, 2, 5, 30, 7, 2, 15, 4, 1, 12, -10};


        for (int a : tabela1D) {
            System.out.println(a);
        }

        liniaOddzielająca();
        System.out.println("Zadanie a)");

        int a = 0;

        for (int x : tabela1D) {

//            System.out.println(x);


            if (x % 2 == 0 && x > 7) {
//                System.out.println(x);
                a++;
//                break;
//                System.out.println(a);
            }
        }
        System.out.println(a);

        liniaOddzielająca();
        System.out.println("Zadanie b)");

        int b = 0;

        for (int x : tabela1D) {

//            System.out.println(x);

            if (x % 3 == 0 && x % 5 == 0) {
//                System.out.println(x);
                b++;
//                break;
//                System.out.println(a);
            }
        }
        System.out.println(b);

        liniaOddzielająca();
        System.out.println("Zadanie c)");

        int[] tabela1DZastępcza = new int[tabela1D.length];

// Nie wiedziałem czy mi nie pokasuje tabeli1D podczas zamiany to zrobilem tabele zastępczą, tam wstawiłem w odwrotnej
//        kolejności a potem z Zastepczej poprzepisuje do Tabeli1D.

        for (int i = 0; i < tabela1D.length; i++) {
//            System.out.println(i);
//            System.out.println(tabela1D[tabela1D.length - i - 1]);
            tabela1DZastępcza[i] = tabela1D[tabela1D.length - i - 1];
//            System.out.println(tabela1DZastępcza[i]);
        }

        for (int i = 0; i < tabela1D.length; i++) {
            tabela1D [i] = tabela1DZastępcza [i];
            System.out.println(tabela1D[i]);
        }

    }
}
