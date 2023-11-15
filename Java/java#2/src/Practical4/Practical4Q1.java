package Practical4;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practical4Q1{

	public static void main(String[] args) {
		String filename = "Practical4Q1.txt";

		ArrayList<String> list = new ArrayList<String>();

		try{
			Scanner in = new Scanner(new File(filename));

			String line;

		while(in.hasNext()){
			line = in.nextLine();
			String[] words = line.split("[ \n\t\r.,:?)({}\\[\\]]");

			for(String word : words){
				if(word.trim().length() > 0 && word.trim().matches("\\w+"))
					list.add(word.trim());
			}
		}
		} catch( Exception e){
			System.err.println(e);
		}

		Collections.sort(list);
		System.out.println("\n Display words in Ascending order : ");

		for(String word : list){
			System.out.println(word);
		}

	}
}