/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PR3_Questions_20202_Ch03_Part2;

import Q4.*;

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

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public double getGrade() {
        return Grade;
    }

    public void setGrade(double Grade) {
        this.Grade = Grade;
    }

    

    
    

    @Override
    public String toString() {
        return   "  Name=" + Name +  "  Grade=" + Grade ;
    }

    
   
   
}
