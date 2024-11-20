package esercizio1;

public class Rettangolo {


    private double altezza ;
    private double larghezza;

    //creiamo il costrutore

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double getAltezza() {
        return altezza;
    }
    public void setAltezza(double altezza) {
         this.altezza = altezza;
    }
    public double getLarghezza() {
        return larghezza;
    }
    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }
    // metodi per calcolare area e perimetro

    public double calcolaArea() {
        return altezza*larghezza;
    }
    public double calcolaPerimetro() {
    return 2* (altezza + larghezza);
    }
    // metodi di stampa
    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Area: " + r.calcolaArea());
        System.out.println("Perimetro: " + r.calcolaPerimetro());

    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2){
        System.out.println("Rettangolo 1: ");
        stampaRettangolo(r1);

        System.out.println("Rettangolo 2: ");
        stampaRettangolo(r2);

        //somma aree e perimetro

        double sommaAree = r1.calcolaArea() + r2.calcolaArea();
        System.out.println("somma delle aree: " + sommaAree );

        double sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();
        System.out.println("somma dei perimetri: " + sommaPerimetri);
    }
}

