/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_questions_20202_ch04;

/**
 *
 * @author khatib
 */
public class Student {
    
    int id;
    String name;
    String major;
    double Grade;

    

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor(String string) {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGrade() {
        return Grade;
    }

    public void setGrade(double drade) {
        this.Grade = Grade;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", major=" + major + ", Grade=" + Grade + '}';
    }

   

    
  
}


