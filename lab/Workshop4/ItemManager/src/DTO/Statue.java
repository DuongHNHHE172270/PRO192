/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author HAI DUONG
 */
import java.util.Scanner;
public class Statue extends Item {
    private int weight;
    private String colour;
    public Statue(){
        
    }
     public Statue(int Value, String creator, int weight, String colour){
         super(Value, creator);
         this.weight = weight;
         this.colour = colour; 
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void inputStatue () {
        input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight: ");
        weight = sc.nextInt();
        System.out.println("Enter colour: ");
        colour = sc.next();
    }
    
    public void outputStatue () {
        output();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }
}
