/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readerwriter;

/**
 *
 * @author reetaj
 */
public class Lukija extends Thread {

    private IntSailio sailio;
    private boolean done = false;

    public Lukija(IntSailio sailio) {
        this.sailio = sailio;
    }

    public void run() {
        int luku;
        int summa = 0;
        try {
            luku = sailio.getInt();
            while (luku > 0 && !done) {
                System.out.println(this + " luki luvun " + luku);
                summa += luku;
                sleep(500);
                luku = sailio.getInt(); // seuraava luku
            }
            System.out.println(this + " sai summaksi " + summa);
        } catch (InterruptedException e) {
        }
    }

    public void terminate() {
        done = true;
    }
}