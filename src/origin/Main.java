package origin;

import esercizio1.Rettangolo;
import esercizio2.Sim;
import esercizio3.Articolo;
import esercizio3.Carrello;
import esercizio3.Cliente;

import java.time.LocalDate;

import static esercizio1.Rettangolo.stampaDueRettangoli;
import static esercizio1.Rettangolo.stampaRettangolo;

public class Main {

    public static void main(String[] args){


        // creazione dei due rettangoli
        Rettangolo r1 = new Rettangolo(5, 10);
        Rettangolo r2 = new Rettangolo(3, 7);

        //ora richiamo i metodi della classe Rettangolo

        System.out.println("stampa primo rettangolo: ");
        stampaRettangolo(r1);
        System.out.println("stampa secondo rettangolo: ");
        stampaRettangolo(r2);

        System.out.println("stampiamo i 2 rettangoli assieme: ");
        stampaDueRettangoli(r1, r2);

        // Creazione SIM per esercizio 2

        Sim miaSim = new Sim("3288962012");

        miaSim.ricarica(10.0);

        miaSim.effettuaChiamate("3334354651", 3);
        miaSim.effettuaChiamate("3334354653", 6);
        miaSim.effettuaChiamate("3334354654", 29);

    // infine stampo i dati della SIM
        miaSim.stampaDatiSim();

    // simulazione di un E-commerce
        Articolo articolo1 = new Articolo("A001", "Laptop", 999.99, 10);
        Articolo articolo2 = new Articolo("A002", "Mouse", 19.99, 50);
        Articolo articolo3 = new Articolo("A003", "Tastiera", 49.99, 30);

        Cliente cliente1 = new Cliente("C001", "Mario", "Rossi", "mario.rossi@example.com", LocalDate.now());

        Carrello carrello = new Carrello(cliente1);

        carrello.aggiungiAlCarrello(articolo1);
        carrello.aggiungiAlCarrello(articolo2);
        carrello.aggiungiAlCarrello(articolo3);
        carrello.mostraCarrello();
    }
}
