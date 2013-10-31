/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_3;

import java.io.Console;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author reetaj
 */
public class Saie implements Runnable {

    int kokomatka = 200;
    int eteenpain = 10;
    int edettymatkanyt = 0;
    Random rand = new Random();
    int x;
    long totaltime = 0;
    private int id = 1;

    public void run() {

        System.out.println("Säie nro " + id + " käynnistynyt");

        int myId;

        synchronized (this) {
            myId = id++;
        }

        do {
            edettymatkanyt = edettymatkanyt + eteenpain;
            //System.out.println(edettymatkanyt);
            try {
                x = rand.nextInt(1401 - 1100) + 1100;
                sleep(x);
                System.out.println("Sleeptime: " + x);
                totaltime = totaltime + x;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (edettymatkanyt < kokomatka);
        System.out.println("Säie nro " + myId + " maalissa");
        System.out.println("Juoksemiseen käytetty aika : " + TimeUnit.MILLISECONDS.toSeconds(totaltime) + " sekuntia");
    }
}
