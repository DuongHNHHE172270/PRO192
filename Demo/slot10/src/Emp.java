/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HAI DUONG
 */
import java.util.*;
public class Emp implements Comparable<Emp>{
    String name;
    int Age;
    double income;
    Emp () {
        
    }
    Emp (String xName, int xAge, double xincome ) {
        name = xName;
        Age = xAge;
        income = xincome;
    }
    public String toString () {
        String s = "(" + name + "," + Age + "," + income +")";
        return(s);
    }
    public int CompareTo(Emp x){
        if(Age < x.Age){
            return (-1);
        }
        else if(Age == x.Age)
            return (name.CompareTo(x.name));
        return (1);
        
    }

    @Override
    public int compareTo(Emp o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
