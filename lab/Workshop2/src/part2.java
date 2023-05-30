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

public class ValidateString {
    public static void main(String[] args) {
        boolean cont = false;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                String s = "";
                String pattern = "SE\\d{3}"; // Regular expression pattern

                System.out.println("Enter the string: ");
                s = sc.nextLine();

                if (!s.matches(pattern)) {
                    throw new Exception();
                }

                System.out.println("The string is: " + s);
                cont = false;
            } catch (Exception e) {
                System.out.println("The string is invalid.");
                cont = true;
            }
        } while (cont);
    }
}
