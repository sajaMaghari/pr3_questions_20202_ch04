/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PR3_Questions_20202_Ch03_Part;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author khatib
 */
public class q1 {

    public static void main(String[] args) {

        int min = 0;
        int max = 100;
        int sum = 0;
        int avg = 0;

        Random random = new Random();
        LinkedList list = new LinkedList();

        System.out.println("Random value in double from " + min + " to " + max + ":");
        for (int i = 1; i <= 30; i++) {
            int value = random.nextInt(100);
            list.add(value);
            sum = sum + value;

          avg= sum/30;
      
        }
        System.out.println(list);
        System.out.println(sum);
        System.out.println(avg);

    }
}
