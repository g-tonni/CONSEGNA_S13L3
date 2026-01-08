package es3;

import entities.Articolo;
import entities.Carrello;
import entities.Cliente;

public class Es3 {
    static void main() {
        Cliente cliente1 = new Cliente("Mario", "Rossi", "mariorossi@gmail.com", "12/10/2023");
        Articolo a1 = new Articolo("Padella", 25, 7);
        Articolo a2 = new Articolo("Presina", 4, 15);
        Articolo a3 = new Articolo("Mestolo", 6, 13);
        Articolo a4 = new Articolo("Scolapasta", 12, 6);
        Articolo a5 = new Articolo("Frullatore", 47, 8);

        Articolo[] listaArticoli = {a1, a2, a3, a4, a5};

        Carrello carrello1 = new Carrello(cliente1, listaArticoli);
        System.out.println(carrello1);
    }
}
