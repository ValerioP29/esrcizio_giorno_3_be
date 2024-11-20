package esercizio3;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
    private Cliente cliente;
    private List<Articolo> articoli;
    private double totale;

    public Carrello (Cliente cliente) {
        this.cliente = cliente;
        this.articoli = new ArrayList<>();
        this.totale = totale;
    }
    // Aggiungi al carrello
    public void aggiungiAlCarrello(Articolo articolo) {
        if (articolo.getPezziDisponibili()> 0) {
            articoli.add(articolo);
            totale += articolo.getPrezzo();
            articolo.setPezziDisponibili(articolo.getPezziDisponibili() -1);

        }
        else {
            System.out.println("Articolo non disponibile" + articolo.getDescrizioneArticolo());
        }
    }
    // calcolo del totale
    public void mostraCarrello() {
        System.out.println("Carrello di: " + cliente.getNome() + " " + cliente.getCognome());
        for (Articolo articolo : articoli) {
            System.out.println(articolo);
        }
        System.out.println("Totale: $" + totale);
        }
    }


