/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

/**
 *
 * @author HAI DUONG
 */
public interface VNRemote {
    final int MAXofButtons = 20; //constant
    int price = 10;
    public static void setTimer(int number){
        System.out.println("shut down after" + number + "second");   
    }
    public abstract void onDevice (); //np body
    abstract public void offDevice();
    default void setLock() {
        System.out.println("set lock in the default method");
    }
}
