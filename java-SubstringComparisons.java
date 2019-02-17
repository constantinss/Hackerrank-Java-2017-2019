package elsys;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubstringComparisons {
	
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest  = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {
            String current = s.substring(i, i + k);
            if (smallest.compareTo(current) > 0){
                smallest = current;
            }
            if (largest.compareTo(current) < 0) {
                largest = current;
            }
        }
        
        return smallest + "\n" + largest;
    }

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }

}
