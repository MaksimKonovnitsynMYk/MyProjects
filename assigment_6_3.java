package Assigment_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class assigment_6_3 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Please provide a string");
Scanner String = new Scanner (System.in);
String N = String.next();

		String blogName = "Hello World";
        char[] chars = blogName.toCharArray();
         
        Map<Character, Integer> map = new HashMap<>();
        for(char c : chars) 
        {
            if(map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println();
        System.out.println("Duplicate characters:");
         
        //Print duplicate characters
        for(char c : map.keySet()) {
            if(map.get(c) > 1) {
                System.out.println(c);
            }
        }
        }
}
      