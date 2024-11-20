package esercizio2;
import esercizio2.Chiamata;
import java.util.LinkedList;

public class Sim {
    private String numeroTelefono;
    private double creditoResiduo;
    private LinkedList <Chiamata> listaChiamate;

    public Sim (String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.creditoResiduo = 0.0;
        this.listaChiamate = new LinkedList<>();
    }

    // aggiungo chimata più recente e de elimino la più vecchia se supera 5

    public void effettuaChiamate(String numeroChiamato, int durata) {
        if (listaChiamate.size() == 5) {
            listaChiamate.removeFirst();
        }
        listaChiamate.add(new Chiamata(numeroChiamato, durata));
    }
    // metodo per stampare i dati della sim
    public void stampaDatiSim() {
        System.out.println("numero di telefono: " + numeroTelefono);
        System.out.println("credito residuo: " + creditoResiduo);
        System.out.println("Lista chiamate: ");
        if (listaChiamate.isEmpty()) {
            System.out.println("Nessuna chiamata");
        }
        else {
            for (Chiamata chiamata : listaChiamate) {
                System.out.println(chiamata);
        }
        }
    }
    // metodo per aggiungere credito
    public void ricarica(double importo) {
        if (importo > 0) {
            creditoResiduo += importo;        }
    }

}

