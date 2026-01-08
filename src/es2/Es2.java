package es2;

import entities.Chiamata;
import entities.SIM;

public class Es2 {
    static void main() {

        SIM s1 = new SIM(393393393);

        System.out.println(s1);

        Chiamata c1 = new Chiamata(30, 333333333);
        Chiamata c2 = new Chiamata(20, 999999999);
        Chiamata c3 = new Chiamata(15, 888888888);
        Chiamata c4 = new Chiamata(25, 222222222);
        Chiamata c5 = new Chiamata(5, 444444444);
        Chiamata[] chiamate = {c1, c2, c3, c4, c5};

        s1.setChiamate(chiamate);
        s1.setCredito(32);

        System.out.println(s1);

    }
}
