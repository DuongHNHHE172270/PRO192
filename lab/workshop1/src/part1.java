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
    public static void main(String[] args){
        int rows;
       int cols;
       int matrix[][];
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of rows: ");
       rows = sc.nextInt();
       System.out.println("Enter number of  cols");
       cols = sc.nextInt();
       matrix = new int[rows][cols];
       System.out.println("Enter the matrix: ");
       int i, j;
       for(i = 0; i < rows; i++){
           for(j = 0; j < cols; j++){
               System.out.print("\nm["+i+"]["+j+"]=");
               matrix[i][j] = sc.nextInt();
           }
       }
       System.out.println("Matrix inputted:");
       int sum = 0;
       for(i = 0; i < rows; i++){
           for(j = 0; j < cols; j++){
               System.out.format("%3d",matrix[i][j]);
               sum += matrix[i][j];
           }
           System.out.println("\n");
       }
       System.out.println("sum: " + sum);
       System.out.println("Average:" + (float)sum/(rows*cols));


    }
}