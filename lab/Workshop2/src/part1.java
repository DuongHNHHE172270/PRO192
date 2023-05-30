/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HAI DUONG
 */
import java.util.Scanner;
public class part1 {
    public static void main (String[] args){
        boolean cont = false;
        do {
            try{
                int num;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number: ");
                num = sc.nextInt();
                if(num < 1){
                    throw new Exception();
                }
                System.out.println("The number is: " + num);
                cont = false;
            }catch(Exception e){
                System.out.println("The number is invalid ");
                cont = true;
            }
        } while (cont);
        
    }
}
