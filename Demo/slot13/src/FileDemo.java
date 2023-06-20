/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HAI DUONG
 */
import java.io.*;
import java.util.Date;
public class FileDemo {
    public static void main(String[] args) throws IOException{
        File f = new File("f1.txt");
        System.out.println("Ten file la: " + f.getName());
        System.out.println("Ten file tuyet doi la: " + f.getAbsoluteFile());
        System.out.println("Dường dẫn tuyệt đối: " + f.getAbsolutePath());
        System.out.println("Path chuẩn là: " + f.getCanonicalPath());
        System.out.println("Ngày cập nhật cuối cùng: " + new Date(f.lastModified()));
        System.out.println("Thuộc tính Hidden là: " + f.isHidden());
        System.out.println("Thuộc tính can-read: " + f.canRead());
        System.out.println("Thuộc tính can-write: " + f.canWrite());
        System.out.println("Kích thược: " + f.length() + " byte");
    }
}
