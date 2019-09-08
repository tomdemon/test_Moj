package test2;

public class Main {
    public static void main(String[] args) {

        // to nie powinno byc tak
        System.out.println("To powinno byc nie lub nie");
        System.out.println("To powinno byc tak, albo tak");
        int[] tabela1D = new int[13];

        // komentarz
        for (int i = 12; i >= 0; i--) {
            tabela1D[i] = i+1;
            System.out.println(tabela1D[i]);

        }

    }
}
