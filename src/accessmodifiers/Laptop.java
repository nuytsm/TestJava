package Com.company;

public class Laptop extends PC {
    int gewicht;

    public Laptop() {
    }

    public Laptop(int gewicht) {
        this.gewicht = gewicht;
    }

    public Laptop(int ramgehuegen, int hddCapacity, int gewicht) {
        super(ramgehuegen, hddCapacity);
        this.gewicht = gewicht;
    }


    public Laptop(int ramgehuegen, int gewicht) {
        super(ramgehuegen);
        this.gewicht = gewicht;
    }
}

