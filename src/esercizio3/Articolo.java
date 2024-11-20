package esercizio3;

public class Articolo {
    private String codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private int pezziDisponibili;

    public Articolo (String codiceArticolo, String descrizioneArticolo, double prezzo, int pezziDisponibili ) {
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.pezziDisponibili = pezziDisponibili;
    }
    // dopo aver inizializzato le variabili procediamo al getter e setter per modificare codice deswcrizione e prezzo

    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    public void setCodiceArticolo(String codiceArticolo) {
        this.codiceArticolo = codiceArticolo;
    }

    public String getDescrizioneArticolo() {
        return  descrizioneArticolo;
    }

    public void setDescrizioneArticolo(String descrizioneArticolo) {
        this.descrizioneArticolo = descrizioneArticolo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getPezziDisponibili() {
        return pezziDisponibili;
    }

    public void setPezziDisponibili(int pezziDisponibili) {
        this.pezziDisponibili = pezziDisponibili;
    }

    // ora metodo toString() per migliorare la legibilità, uso Override per sovrscrivere la superclasse Object
    @Override
    public String toString() {
        return "Articolo: " + descrizioneArticolo + " Codice: " + codiceArticolo + " Prezzo: " + prezzo + " Pezzi Disponibili: " + pezziDisponibili;
    }
}
