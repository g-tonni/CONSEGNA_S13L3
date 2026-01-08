package entities;

import java.util.Arrays;

public class SIM {
    private int num;
    private double credito;
    private Chiamata[] chiamate;

    public SIM (int num){
        this.num = num;
        this.credito = 0;
        this.chiamate = new Chiamata[5];
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }

    @Override
    public String toString() {
        return "SIM{" +
                "num=" + num +
                ", credito=" + credito +
                ", chiamate=" + Arrays.toString(chiamate) +
                '}';
    }
}
