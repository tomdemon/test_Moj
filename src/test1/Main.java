package test1;

public class Main {

    public static int countSum (int sum) {
        sum = sum + 2;
        return sum;
    }



    public static void main(String[] args) {

        int a = 5;
        int mySum = countSum (a);
        System.out.println("Moja suma to : " + mySum);
        }


}
