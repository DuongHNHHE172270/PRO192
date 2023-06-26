/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HAI DUONG
 */
public class Student {
    String code="";
    String name="";
    int mark = 0;

    public Student() {
    }

    public Student(String code, String name, int mark) {
        this.code = code.toUpperCase();
        this.name = name.toUpperCase();
        this.mark = (mark >= 0 && mark <= 10)?mark:0;
    }

    public String getCode() {
        return code;
    }
      public String getName() {
        return name;
    }

    public void setName(String name) {
        name= name.trim().toUpperCase();
        if(name.length()>0)this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        if(mark >= 0 && mark <= 10) this.mark = mark;
    }

    @Override
    public String toString() {
        return  code+ " ,"  + name+" ," + mark ;
    }
    
}