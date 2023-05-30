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
public class part3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine(); // Tiêu thụ ký tự xuống dòng sau nextInt()

        String[] studentNames = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = sc.nextLine();
        }

        // In danh sách tên sinh viên
        System.out.println("List of student names:");
        for (String name : studentNames) {
            System.out.println(name.toUpperCase());
        }

        sc.close();

    }
}
