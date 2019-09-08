package obiektowosc;

public class Wejscowa {

    public static void main(String[] args) {
        System.out.println(Samochod.wiekStatyczny);

        Samochod porshe = new Samochod("porshe", 1995);
        Samochod ford = new Samochod("ford", 2012);
        Samochod fiat = new Samochod("ford");

        System.out.println(porshe.wiekObiektowy);
//
        porshe.opiszSamochod();
        ford.opiszSamochod();
        fiat.opiszSamochod();


    }
}
