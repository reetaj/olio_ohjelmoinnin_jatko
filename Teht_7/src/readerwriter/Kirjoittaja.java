/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readerwriter;

/**
 *
 * @author reetaj
 */
public class Kirjoittaja extends Thread {

    private IntSailio sailio;
    private boolean done = false;

    public Kirjoittaja(IntSailio sailio) {
        this.sailio = sailio;
    }

    public void run() {
        try {
            for (int i = 0; i < 10 && !done; i++) {
                int luku = 2 * i + 1;
                sailio.setInt(luku);
                System.out.println(this + " kirjoitti luvun " + luku);
                sleep(500);
            }
            sailio.setInt(-1); // ei enää lukuja
        } catch (InterruptedException e) {
        }
    }

    public void terminate() {
        done = true;
    }
}
