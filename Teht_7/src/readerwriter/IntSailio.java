/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readerwriter;

/**
 *
 * @author reetaj
 */
public class IntSailio {

    int arvo;
// IntSailio on luokka, johon rakennetaan monitori
// määrittelelmällä joukko synkronoituja metodeja

    public IntSailio() {
        arvo = 0; // 0 edustaa tyhjää säiliötä
    }

    public synchronized int getInt() throws InterruptedException {
        if (arvo == -1) {
            wait();
        } else {

            while (arvo == 0) {
                wait();
            }
            int paluuarvo = arvo;
            arvo = 0; // tyhjennetään säiliö
            notifyAll(); // herätetään kaikki odottajat
        }
        return paluuarvo;
    }
    public synchronized void setInt(int n) throws InterruptedException {
        while (!(arvo == 0)) {
            wait();
        }
        arvo = n;
        notifyAll();
    }
}
