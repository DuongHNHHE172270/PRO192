package demo1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HAI DUONG
 */
public class Demo_1 {
    public static void main (String[] args){
        rectangle r = new rectangle();
        r.setValue(5);
        System.out.println(r.toString());
        r.setValue(10, 20);
        System.out.println(r.toString());
        box b = new box();
        b.set(5,10,15);
        System.out.println(b.toString());
    }
}
