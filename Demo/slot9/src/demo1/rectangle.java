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
public class rectangle {
    protected int length = 0, width = 0;
//    overloading method
    public void setValue (int l){
        length = l>0 ? l:0;
    }
    public void setValue(int l, int w){
        length = l>0 ? l:0;
        width = w>0? w:0;
    }

//    overiding the toString method of the java.lang.object class
    public String toString() {
        return "[" + length + "," + width + "]";
    }
}
