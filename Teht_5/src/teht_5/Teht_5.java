/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_5;

/**
 *
 * @author reetaj
 */
public class Teht_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Käynnistetään säikeet:
        for (int i = 1; i < 5; i++) {
            new Saie(i).start();
        }
        System.out.println("Kaikki säikeet ovat käynnistyneet");
    }
}
