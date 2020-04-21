/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PR3_Questions_20202_Ch01;

/**
 *
 * @author khatib
 */
public class ItStudent extends Student{
   
    public ItStudent(int id, String name,double mid ,double project,double finals) {
       

        this.Grade = mid*0.30 + project*0.30 + finals*40;
        this.name= name;
        this.id= id;
    }}