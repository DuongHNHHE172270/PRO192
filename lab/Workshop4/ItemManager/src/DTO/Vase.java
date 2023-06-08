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
public class Vase extends Item{
    private int height;
    private String material;
    
    public Vase () {
        
    }
    
    public Vase (int Value, String creator, int height, String material) {
        super(Value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void inputVase () {
        input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height: ");
        height = sc.nextInt();
        System.out.println("Enter material: ");
        material = sc.next();
    }
    public void outputVase() {
        output();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }
}
