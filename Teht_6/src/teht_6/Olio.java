/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_6;

/**
 *
 * @author reetaj
 */
public class Olio {

    private int x;
    private int y;
    private int tmp;

    public Olio(){
        this.x = 20;
        this.y = 10;
    }
    
    public synchronized void swap() {

        if (this.x != this.y) {
            tmp = this.x;
            this.x = this.y;
            this.y = tmp;
            System.out.println("Säie swappaa arvoja " + x + " <-> " + y);
        }
        else{
            System.out.println("Samat arvot, ei swapata");
        }
    }
}
