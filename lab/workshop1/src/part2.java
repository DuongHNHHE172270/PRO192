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
public class part2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        float num1, num2;
        String op;
        System.out.println("Input the number 1: ");
        num1 = sc.nextFloat();
        System.out.println("Input the number 2: ");
        num2 = sc.nextFloat();
        System.out.println("Input the operator(+-*/): ");
        sc = new Scanner(System.in);
        op = sc.nextLine();
        switch (op) {
         case "+":
                System.out.println("The result of " + num1 + op + num2 + " = " + (num1 + num2));
                break;
         case "-":
                System.out.println("The result of " + num1 + op + num2 + " = " + (num1 - num2));
                break;
         case "*":
                System.out.println("The result of " + num1 + op + num2 + " = " + (num1 * num2));
                break;
         case "/":
                if(num2 == 0){
                    System.out.println("the number 2 Cannot by zero");
                }
                else{
                        System.out.println("The result of " + num1 + op + num2 + " = " + (num1 / num2));
                break;
                }
                default:
                        System.out.println("Invalid operator!");
                        break;
        }


    }
}

