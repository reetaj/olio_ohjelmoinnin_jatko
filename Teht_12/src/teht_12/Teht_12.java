/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author reetaj
 */
public class Teht_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int summa = 0;
        int i1 = 1;
        int i2 = 2;
        Integer i3 = new Integer(3);
        int i4 = 4;
        Integer i5 = new Integer(5);
        
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(i1);
        lista.add(i2);
        lista.add(i3);
        lista.add(i4);
        lista.add(i5);
        
        for(Integer i : lista){
            summa = summa + i.intValue();
            System.out.println("Luku on " + i.intValue());
        }
        
        System.out.println("Lukujen summa on : " + summa);
    }
}
