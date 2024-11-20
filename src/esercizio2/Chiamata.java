package esercizio2;

public class Chiamata {
    private String numeroChiamato;
    private int durata;

    public Chiamata (String numeroChiamato, int durata) {
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }


    @Override
    public String toString() {
        return "Chiamata a " + numeroChiamato + ", durata: " + durata + "minuti";
    }
}
