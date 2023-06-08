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
public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;
    
      public Painting() {
    }

    public Painting(int Value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(Value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    
     public void inputPainting() {
        input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height: ");
        height = scanner.nextInt();
        System.out.print("Enter width: ");
        width = scanner.nextInt();
        System.out.print("Is it watercolour? (true/false): ");
        isWatercolour = scanner.nextBoolean();
        System.out.print("Is it framed? (true/false): ");
        isFramed = scanner.nextBoolean();
    }
     
      public void outputPainting() {
        output();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Is Watercolour: " + isWatercolour);
        System.out.println("Is Framed: " + isFramed);
    }
}
