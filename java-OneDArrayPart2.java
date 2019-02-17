package elsys;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OneDArrayPart2 {
	
	public static int[] game;
	public static   int leap;
	public static   int n;
	public static boolean[] visitedArray;
	private static boolean result=false;
	    
	    public static void canWin(int i) {
	            if(i>n || i+leap >= n || i==n-1){
	                result =true;
	                return; 
	            }
	            if(visitedArray[i] == true){
	                return;
	            }
	            visitedArray[i]= true;
	            if (i+1 < n && game[i+1]==0){
	                canWin(i+1);            
	            }
	            if (i-1>=0 && game[i-1]==0){
	            	canWin(i-1);
	            }
	            if(i+leap < n && game[i+leap]==0){
	                canWin(i+leap);
	            }
	    }
	    
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int q = scan.nextInt();
	        while (q-- > 0) {
	                    n = scan.nextInt();
	                    game = new int[n];
	                    visitedArray= new boolean[n];
	                    Arrays.fill(visitedArray,false);
	                    leap = scan.nextInt();
	                    for (int i = 0; i < n; i++) {
	                        game[i]= scan.nextInt();
	                    }
	            int temp = 0;
	            result = false;
	            canWin(temp);
	            System.out.println(result == true  ? "YES" : "NO" );
	        }
	        scan.close();
	    }
	}


