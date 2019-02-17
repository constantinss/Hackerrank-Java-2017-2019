package elsys;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Subarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int arr[] = new int[n];
	       for(int i = 0; i < n; i++){
	               arr[i] = sc.nextInt();	           
	       }
	    sc.close();
	    
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
		System.out.println(count);
	}

}
