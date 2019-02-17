package elsys;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class TwoDArray {

	public static void main(String[] args) {
		 int sum = 0;
	        int bigger = Integer.MIN_VALUE;
	        Scanner in = new Scanner(System.in);
	        int arr[][] = new int[6][6];
	        for(int i=0; i < 6; i++){
	            for(int j=0; j < 6; j++){
	                arr[i][j] = in.nextInt();
	            }
	        }
	        
	        for(int x = 0; x < 4; x++){
	            for(int y = 0; y < 4; y++){

	                sum = arr[x][y] + arr[x][y+1] + arr[x][y+2] + arr[x+1][y+1] + arr[x+2][y] + arr[x+2][y+1] + arr[x+2][y+2];
	                
	                bigger = Math.max(sum, bigger);
	            }
	        }
	        System.out.println(bigger);

	}

}
