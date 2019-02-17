package homework;

import java.util.Scanner;
import java.io.BufferedReader;


public class EndOfFile {

	public static void main(String[] args) {
		Scanner line = new Scanner(System.in);
		int i = 1;
		while(line.hasNextLine()){
			String s = line.nextLine();
			System.out.println(i++ + " " + s);
		}
		
	

	}

}
