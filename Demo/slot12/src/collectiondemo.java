/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HAI DUONG
 */
import java.util.ArrayList;
import java.util.Vector;
import java.util.Collections;
import java.util.Random;
public class collectiondemo {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        Vector v = new Vector ();
        Random rd = new Random (); //max :30
        for (int i = 1; i <= 10; i++) {
            ar.add(rd.nextInt(30));
            v.add(rd.nextInt(30));
        }
        System.out.println("ar = " + ar);
        System.out.println("v = " + v);
        boolean dis = Collections.disjoint(ar, v);
        System.out.println("ar and v are disjuct: " + dis);
        Collections.addAll(v, ar.toArray());
        System.out.println("After adding, v = " + v);
        int minVal = (int)Collections.min(v);
        int maxVal = (int)Collections.max(v);
        System.out.println("min= " + minVal + ", max = " + maxVal);
        int fre = Collections.frequency(v, 8);
        System.out.println("Occurences of 8: " + fre);
        Collections.sort(v);
        System.out.println("After sorting:, v = " + v);
        int pos = Collections.binarySearch(v, 8);
        System.out.println("Position of 8: " + pos);
        Collections.shuffle(v);
        System.out.println("After Suffling, v = " + v);
    }
}
