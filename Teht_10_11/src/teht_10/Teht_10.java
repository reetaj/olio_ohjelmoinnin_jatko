/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teht_10;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author reetaj
 */
public class Teht_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List lista3 = new ArrayList();
        lista3.add(new Point(1, 2));
        lista3.add(new Point(2, 3));
        lista3.add(new Point(3, 4));
        lista3.add(new Point(4, 5));

        System.out.println("ArrayList for-luupissa");
        
        for (int i = 0; i < 4; i++) {
            Point p = (Point) lista3.get(i);
            System.out.println("X:n sijainti : " + p.getX() + " ja Y:n sijainti : " + p.getY());
        }

        List<Point> lista1 = new ArrayList<>();
        lista1.add(new Point(1, 2));
        lista1.add(new Point(2, 3));
        lista1.add(new Point(3, 4));
        lista1.add(new Point(4, 5));
        Iterator<Point> i = lista1.iterator();
        
        System.out.println("ArrayList while-luupissa");
        
        while (i.hasNext()) {
            Point p = i.next();
            System.out.println("X:n sijainti : " + p.getX() + " ja Y:n sijainti : " + p.getY());
        }

        System.out.println("ArrayList for-each-luupissa");
        
        for (Point p : lista1) {
            System.out.println("X:n sijainti : " + p.getX() + " ja Y:n sijainti : " + p.getY());
        }

        Vector<Point> lista2 = new Vector<>();
        lista2.add(new Point(7, 8));
        lista2.add(new Point(4, 5));
        lista2.add(new Point(5, 6));
        lista2.add(new Point(6, 7));
        Enumeration e = lista2.elements();

        System.out.println("Vektori while-luupissa");

        while (e.hasMoreElements()) {
            Point p = (Point) e.nextElement();
            System.out.println("X:n sijainti : " + p.getX() + " ja Y:n sijainti : " + p.getY());
        }

        System.out.println("Vektori for-each-luupissa");

        for (Point p : lista2) {
            System.out.println("X:n sijainti : " + p.getX() + " ja Y:n sijainti : " + p.getY());
        }
    }
}
