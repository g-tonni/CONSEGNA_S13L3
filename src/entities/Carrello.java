package entities;

import java.util.Arrays;

public class Carrello {
    private Cliente cliente;
    private Articolo[] articoli;
    private int totCarrello;

    public Carrello (Cliente cliente, Articolo[] articoli){
        this.cliente = cliente;
        this.articoli = articoli;
        this.totCarrello = 0;
        for(int i = 0; i < articoli.length; i++){
            this.totCarrello = this.totCarrello + articoli[i].getPrezzo();
        }

    }



    @Override
    public String toString() {
        return "Carrello{" +
                "cliente=" + cliente +
                ", articoli=" + Arrays.toString(articoli) +
                ", totCarrello=" + totCarrello +
                '}';
    }
}
