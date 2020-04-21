/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PR3_Questions_20202_Ch02;

/**
 *
 * @author khatib
 */
class Student {
     Integer ID; 
    String Name; 
    String Major;
    double Grade;

    public Student() {
    }

    public Student(Integer ID, String Name, String Major, double Grade) {
        this.ID = ID;
        this.Name = Name;
        this.Major = Major;
        this.Grade = Grade;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
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
        return  "ID=" + ID + ", Name=" + Name + ", Major=" + Major + ", Grade=" + Grade + '}';
    }
}
