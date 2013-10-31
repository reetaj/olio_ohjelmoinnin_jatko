/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readerwriter;

/**
 *
 * @author reetaj
 */
public class LukijaKirjoittaja {

    private IntSailio sailio = new IntSailio();
    private Kirjoittaja k = new Kirjoittaja(sailio);
    private Lukija l1 = new Lukija(sailio);
    private Lukija l2 = new Lukija(sailio);

    public LukijaKirjoittaja() {
        k.start();
        l1.start();
        l2.start();
    }

    public static void main(String[] args) {
        new LukijaKirjoittaja();
    }
}
