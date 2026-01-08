package es1;

import entities.Rettangolo;

public class Es1 {
    static void main() {

        Rettangolo r1 = new Rettangolo(2, 3);
        Rettangolo r2 = new Rettangolo(4, 8);

        r1.stampaRettangolo();
        r2.stampaRettangolo();

        Rettangolo.stampaDueRettangoli(r1, r2);
    }
}
