/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wokshop3;

/**
 *
 * @author HAI DUONG
 */


public class Guitar {
    private String serialNumber;
    private int price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;
    
    public Guitar() {
        serialNumber = null;
        price = 0;
        builder = null;
        model = null;
        backWood = null;
        topWood = null;
    }
    
    public Guitar(String serialNumber, int price, String builder, String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }
    
    public String getSerialNumber() {
        return serialNumber;
    }
    
    public int getPrice() {
        return price;
    }
    
    public String getBuilder() {
        return builder;
    }
    
    public String getModel() {
        return model;
    }
    
    public String getBackWood() {
        return backWood;
    }
    
    public String getTopWood() {
        return topWood;
    }
    
    public void setSerialNumber(String serialNumber) {
        if (serialNumber != null && !serialNumber.isEmpty()) {
            this.serialNumber = serialNumber;
        }
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public void createSound() {
        System.out.println("Serial Number: " + (serialNumber != null ? serialNumber : "null"));
        System.out.println("Price: " + price);
        System.out.println("Builder: " + (builder != null ? builder : "null"));
        System.out.println("Model: " + (model != null ? model : "null"));
        System.out.println("Back Wood: " + (backWood != null ? backWood : "null"));
        System.out.println("Top Wood: " + (topWood != null ? topWood : "null"));
    }
}


    

