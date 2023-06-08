/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author HAI DUONG
 */
import DTO.Item;
import DTO.Vase;
import DTO.Statue;
import DTO.Painting;
import java.util.Scanner;
public class AntiqueShop {
    public static void main (String[] args){
         String[] options = {"Create a Vase", "Create a Statue", "Create a Painting", "Display the Item"};
        Item item = null;
        int choice = 0;
        do {
            choice = Menu.getChoice(options);
            switch (choice) {
                case 1:
                    item = new Vase();
                    ((Vase) item).inputVase();
                    break;
                case 2:
                    item = new Statue();
                    ((Statue) item).inputStatue();
                    break;
                case 3:
                    item = new Painting();
                    ((Painting) item).inputPainting();
                    break;
                case 4:
                    if (item != null) {
                        if (item instanceof Vase)
                            ((Vase) item).outputVase();
                        else if (item instanceof Statue)
                            ((Statue) item).outputStatue();
                        else if (item instanceof Painting)
                            ((Painting) item).outputPainting();
                    } else {
                        System.out.println("You need to create an object");
                    }
                    break;
            }
        } while (choice <= 4);
    }
}
class Menu {
    public static int getChoice(String[] options) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        System.out.print("Input a choice: ");
        return scanner.nextInt();
    }
}
