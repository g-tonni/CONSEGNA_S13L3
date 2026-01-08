package entities;

public class Chiamata {

    int durata;
    int numeroChiamato;

    public Chiamata(int durata, int numeroChiamato){
        this.durata = durata;
        this.numeroChiamato = numeroChiamato;
    }

    @Override
    public String toString() {
        return "Chiamata{" +
                "durata=" + durata +
                ", numeroChiamato=" + numeroChiamato +
                '}';
    }
}
