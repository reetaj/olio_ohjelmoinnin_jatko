/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_2;


/**
 *
 * @author reetaj
 */
public class Teht_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Saie s = new Saie();
        s.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
  
        s.lopeta();
    }
}
