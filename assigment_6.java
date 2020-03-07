package Assigment_6;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class assigment_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random randomClass = new Random(); 
		Set <Integer> ts = new TreeSet<Integer>();
		
		while (ts.size()<500) {
			int randNum = randomClass.nextInt ((1000 - 100)+1)+100;
	//		System.out.println(randNum);
		ts.add(randNum);
		}
		
		
	//	System.out.print(ts);
		System.out.println(ts.size());
		System.out.println();
		
		
		Object [] allRandom = ts.toArray();
	
		System.out.println("Which Nth smallest number would you want?");
		Scanner RandomNumberfromUser = new Scanner (System.in);
		int N = RandomNumberfromUser.nextInt();
		
	System.out.println(allRandom[N-1]);
	}

}
