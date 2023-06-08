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
public class Item {
    private int Value;
    private String creator;
    
    public Item () {
        
    }
    public Item (int Item, String creator) {
        this.Value = Value;
        this.creator = creator;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int Value) {
        this.Value = Value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void input () {
    Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter value : ");
            Value = sc.nextInt();
        }while(Value <= 0);
        sc.nextLine();
        do{
            System.out.println("Enter creator :");
            creator = sc.nextLine();
        }while(creator.isEmpty());
    }
    
    public void output () {
        System.out.println("Value: " + Value);
        System.out.println("creator: " + creator);
    }
}
