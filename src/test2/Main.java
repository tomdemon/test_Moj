package test2;

public class Main {
    public static void main(String[] args) {

        // to nie powinno byc tak
        System.out.println("To powinno byc tak");
        int[] tabela1D = new int[13];

        for (int i = 12; i >= 0; i--) {
            tabela1D[i] = i+1;
            System.out.println(tabela1D[i]);

        }

    }
}
