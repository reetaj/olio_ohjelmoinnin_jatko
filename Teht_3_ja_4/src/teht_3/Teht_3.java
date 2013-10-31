/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_3;

/**
 *
 * @author reetaj
 */
public class Teht_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Saie s = new Saie();
        //s.run();
        
        Thread[] saikeet = new Thread[4];
        // Käynnistetään säikeet:
        for (int i = 0; i < saikeet.length; i++) {
            saikeet[i] = new Thread(s);
            saikeet[i].start();
        }
        System.out.println("Kaikki säikeet ovat käynnistyneet");
    }
}
