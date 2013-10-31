/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_6;

/**
 *
 * @author reetaj
 */
public class Saie extends Thread{
    
    private Olio olio;
    
    public Saie(Olio o){
        this.olio = o;
    }
    
    public void run(){
        olio.swap();
    }
    
}
