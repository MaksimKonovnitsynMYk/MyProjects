package Assigment_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class takeHomeExam {

	String path = "C:/Users/Marsh/Desktop/Dictinary.txt";
	File MyWork = new File(path);

	public static void main(String[] args) throws Exception {

		String path = "C:/Users/Marsh/Desktop/Dictinary.txt";
		doesFileExists(path);
	}

	public static void doesFileExists(String path) throws Exception {
		File MyWork = new File(path);
		if (MyWork.exists())
			System.out.println("Your file is here" + " " + MyWork);

		else {
			throw new Exception("Can't find your file");
		}

		BufferedReader br = new BufferedReader(new FileReader(MyWork));
		while (true) {
			
			String line = br.readLine();
			if(line==null) {break;
				}
			String[] parts = line.split("[-|,]");
			for (String part : parts) {
				System.out.println(part);}


			}	
		}
	}

