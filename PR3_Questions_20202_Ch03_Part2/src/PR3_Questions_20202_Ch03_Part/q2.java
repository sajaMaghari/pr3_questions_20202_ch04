/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PR3_Questions_20202_Ch03_Part;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author khatib
 */
public class q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        		HashMap<Character, Integer> map = new HashMap<>();

String str = "Programming";
		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				int val = map.get(ch);
				map.put(ch, val + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
       
  String s = "House, House, House, Dog, Dog, Dog, Dog";
    List<String> output = new ArrayList<>();
    List<Integer> count = new ArrayList<>();
    findWords(s, output, count);
    System.out.println(output);
    System.out.println(count);


    
}    

    private static void findWords(String s, List<String> output, List<Integer> count) {
    String[] words = s.split(", ");
    Map<String, Integer> map = new LinkedHashMap<>();
    Arrays.stream(words).forEach(e->map.put(e, map.getOrDefault(e, 0) + 1));
    map.forEach((k,v)->{
        output.add(k);
        count.add(v);
    });
} }
    
    
//للتعددا الاحرف 
//public class Counter {
//	public static void main(String[] args) {
//		String str = "Programming";
//		for (char ch : str.toCharArray()) {
//			if (map.containsKey(ch)) {
//				int val = map.get(ch);
//				map.put(ch, val + 1);
//			} else {
//				map.put(ch, 1);
//			}
//		}
//		System.out.println(map);
//	}
//}