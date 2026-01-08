package entities;

import java.util.Random;

public class Articolo {
    private int codiceArticolo;
    private String descrizione;
    private int prezzo;
    private int numArticoli;

    public Articolo (String descrizione, int prezzo, int numArticoli){
        Random rndm = new Random();
        this.codiceArticolo = rndm.nextInt(1, 1000000);
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.numArticoli = numArticoli;
    }

    public int getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "codice=" + codiceArticolo +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", numArticoli=" + numArticoli +
                '}';
    }
}
