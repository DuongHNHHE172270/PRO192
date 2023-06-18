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
public class FPTUniversity extends University implements Role {
   private String Adress;
   
   public FPTUniversity () {
       super();
       Adress = "";
   }

    public FPTUniversity( int size, String Adress, String name) {
        super(size, name);
        this.Adress = Adress;
    }

       @Override
    public String toString() {
        return "FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon";
    }

    @Override
    public void createWorker() {
        System.out.println("providing human resources");
    }
}


