/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarManager;

/**
 *
 * @author HAI DUONG
 */
public class Tester {
    public static void main(String[] args){
        Car c = new Car();
        c.pressStartButton();
        c.pressAcceleratorButton();
        c.output();
        
        System.out.println("");
        Car c2 = new Car("red", 100, true, true);
        c2.pressStartButton();
        c2.setCoulour("black");
        System.out.println("Colour of c2:" + " " + c2.getCoulour());
        c2.output();
    }
}
