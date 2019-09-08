package obiektowosc;

public class Samochod {
    public static int wiekStatyczny = 5;
    public int wiekObiektowy = 10;

    String nazwa;
    int rokProdukcji;
    int obiektowyRokProdukcji;

    public Samochod(String nazwa, int rokProdukcji) {
        this.nazwa = nazwa;
        this.rokProdukcji = rokProdukcji;
        obiektowyRokProdukcji = rokProdukcji;

        System.out.println("Utworzylem nowy samochod: " + nazwa);
    }

    public Samochod(String nawa) {
        this.nazwa = nawa;

    }

    public void opiszSamochod() {
        System.out.println("Jestem " + nazwa + " i moj rok produkcji, to " + rokProdukcji);
    }
}
