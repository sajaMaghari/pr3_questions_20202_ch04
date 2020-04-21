/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4;

/**
 *
 * @author khatib
 */
public class Student1 {
  Integer ID;
    String Name;
    String Major;
    double Grade;

    public Student1() {
    }

    public Student1(Integer ID, String Name, String Major, double Grade) {
        this.ID = ID;
        this.Name = Name;
        this.Major = Major;
        this.Grade = Grade;
    }

    public double getGrade() {
        return Grade;
    }

    
    

    @Override
    public String toString() {
        return  "ID=" + ID + ",  Name=" + Name + ",   Major=" + Major + ",  Grade=" + Grade ;
    }
   
}
