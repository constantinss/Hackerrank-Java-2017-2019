package elsys;
import java.io.*;
import java.util.*;

public class Anagrams {
		
	    static boolean isAnagram(String a, String b) {
	        char[] strOne = a.replaceAll("[\\s]", "").toLowerCase().toCharArray();
	        char[] strTwo = b.replaceAll("[\\s]", "").toLowerCase().toCharArray();
	        Arrays.sort(strOne);
	        Arrays.sort(strTwo);
	       return Arrays.equals(strOne, strTwo); 
	     }

	  public static void main(String[] args) {
		    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}