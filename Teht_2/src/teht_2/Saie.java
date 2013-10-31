/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_2;

import static java.lang.Thread.sleep;

/**
 *
 * @author reetaj
 */
public class Saie extends Thread {

    private volatile boolean valmis = false;

    public void run() {

        while (!valmis) {
            System.out.println("Olen elossa");
        }
        System.out.println("Lopetetaan...");
    }

    public void lopeta() {
        System.out.println("Lopetetaan..............................................");
        valmis = true;
    }
}
