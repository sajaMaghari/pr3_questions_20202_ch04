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
public class ArtStudent extends Student{
    public ArtStudent(int id, String name,double mid ,double report,double finals) {
        this.Grade = mid*0.40 + report*0.10 + finals*50;
        this.name= name;
        this.id= id;
    }
}
