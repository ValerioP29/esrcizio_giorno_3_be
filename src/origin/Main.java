package origin;

import esercizio1.Rettangolo;

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






    }
}
