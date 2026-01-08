package entities;

public class Rettangolo {
    private int l1;
    private int l2;

    public Rettangolo(int l1, int l2){
        this.l1 = l1;
        this.l2 = l2;
    }

    public int calcolaPerimetro(){
        return this.l1 * 2 + this.l2 * 2;
    }

    public int calcolaArea(){
        return this.l1 * this.l2;
    }

    public void stampaRettangolo(){
        System.out.println("Perimetro: " + this.calcolaPerimetro());
        System.out.println("Area: " + this.calcolaArea());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2){
        System.out.println("Perimetro 1: " + r1.calcolaPerimetro());
        System.out.println("Area 1: " + r1.calcolaArea());
        System.out.println("Perimetro 2: " + r2.calcolaPerimetro());
        System.out.println("Area 2: " + r2.calcolaArea());
        System.out.println("Somma perimetri: " + (r1.calcolaPerimetro() + r2.calcolaPerimetro()));
        System.out.println("Somma aree: " + (r1.calcolaArea() + r2.calcolaArea()));
    }
}
