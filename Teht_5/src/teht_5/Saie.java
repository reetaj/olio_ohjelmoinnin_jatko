/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_5;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author reetaj
 */
public class Saie extends Thread {

    int kokomatka = 50;
    int eteenpain = 10;
    int edettymatkanyt = 0;
    Random rand = new Random();
    int x;
    long totaltime = 0;
    private int id = 0;

    public Saie(int id) {
        this.setPriority(Thread.MAX_PRIORITY);
        this.id = id;
    }

    public void run() {

        synchronized (this) {
            id = id++;
        }

        System.out.println("Säie nro " + id + " prioriteetilla " + Thread.currentThread().getPriority() + " on käynnistynyt");

        do {
            edettymatkanyt = edettymatkanyt + eteenpain;
            System.out.println("Saie nro " + id + " on juossut kohtaan " + edettymatkanyt + "m");
            try {
                x = rand.nextInt(1401 - 1100) + 1100;
                sleep(x);
                //System.out.println("Sleeptime: " + x);
                totaltime = totaltime + x;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (edettymatkanyt < kokomatka);
        System.out.println("Säie nro " + id + " maalissa");
        System.out.println("Juoksemiseen käytetty aika : " + TimeUnit.MILLISECONDS.toSeconds(totaltime) + " sekuntia");
    }
}
