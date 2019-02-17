package elsys;
import java.io.*;
import java.util.*;

public class StringTokens {

	public static void main(String[] args) {
		 	Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        scan.close();
	        s = s.trim(); 
	        if (s.length() == 0) {
	            System.out.println(0);
	            return;
	        }
	        String [] res = s.split("[^a-zA-Z]+");

	        System.out.println(res.length);
	        for (String counter : res) {
	            System.out.println(counter);
	        }

	}

}
