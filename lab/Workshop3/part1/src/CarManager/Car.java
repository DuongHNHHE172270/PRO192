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
public class Car {
    private String Colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean ParkingBrake;

       // Default constructor
    public Car () {
        Colour = "";
        EnginePower = 0;
        Convertible = false;
        ParkingBrake = false;
    }
    public Car(String Colour, int EnginePower, boolean Convertible, boolean ParkingBrake ){
        this.Colour = Colour;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.ParkingBrake = ParkingBrake;
    }
    
//    geter
    public String getCoulour() {
        return Colour;
    }
    
    public int getEnginePower(){
        return EnginePower;
    }
    public boolean getConvertible () {
        return Convertible;
    }
    public boolean getParkingBrake () {
        return ParkingBrake;
    }
    
//    setter
    public void setCoulour(String Colour) {
        this.Colour = Colour;
    }
    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public void setParkingBrake(boolean ParkingBrake) {
        this.ParkingBrake = ParkingBrake;
    }
    
//    other
    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }

    public void pressAcceleratorButton() {
        System.out.println("You have pressed the Accelerator button");
    }

    public void output() {
        System.out.println("Colour: " + Colour);
        System.out.println("Engine Power: " + EnginePower);
        System.out.println("Convertible: " + Convertible);
        System.out.println("Parking Brake: " + ParkingBrake);
    }
}

