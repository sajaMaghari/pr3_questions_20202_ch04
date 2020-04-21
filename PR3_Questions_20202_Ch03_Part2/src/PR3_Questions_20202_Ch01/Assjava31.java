/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PR3_Questions_20202_Ch01;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author khatib
 */
public class Assjava31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Q2
            int uint = Integer.parseUnsignedInt("4294967295");
            System.out.println(Integer.toUnsignedString(uint));


        // Q3
            Student[] Students = {
            new ItStudent(111, "Ahmad",30,10 ,40 ),
            new ItStudent(222, "Huda",20, 20, 30),
           
            new ArtStudent(444, "Sami",30,10 ,40),
            new ArtStudent(555, "Marwa", 20,10 ,40),
            
};  
        for (int j = 0; j < Students.length; j++) {
            for(int i=0; i< Students.length-1; i++){
               if(Students[i+1].getGrade()>Students[i].getGrade()){
                   Student temp = Students[i];
                   Students[i]= Students[i+1];
                   Students[i+1] = temp;
               } 
            }             
        }
           List<Student> StudentsList = Arrays.asList(Students)
                .stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed())
                .collect(Collectors.toList());
                
        System.out.println("Sorted Students");
        for(Student Student: StudentsList)
            System.out.println(Student);
    
        
            
        File file = new File("E:\\file.txt");
        PrintWriter pr =null;
        
         try{
            file.createNewFile();
           pr=new PrintWriter(file);
        
            file.createNewFile();
           pr=new PrintWriter(file);
            for(Student a:Students){
                pr.println(a);
            }
          System.out.println("Finish .-.");
}         catch (IOException ex){
             System.out.println("throws IO Exception");
}
        pr.close();
    }
    
    
  
      
}
    



  
    

