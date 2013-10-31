/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_6;

/**
 *
 * @author reetaj
 */
public class Teht_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Olio o = new Olio();

        Saie[] saikeet = new Saie[1000];

        for (int i = 0; i < saikeet.length; i++) {
            saikeet[i] = new Saie(o);
            saikeet[i].start();
        }
        System.out.println("Kaikki säikeet käynnistyneet");
    }
}
