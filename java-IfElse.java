package homework;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IfElse {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n;

		 do {
		  n = sc.nextInt();
		 }while(1 < n && n > 100);
		 
         String ans ="";
         if(n % 2 == 1){
           ans = "Weird";
         }
         else if((n % 2 == 0) && (n >= 2 & n <= 5)){
           ans = "Not Weird";
         }else if((n % 2 == 0) && (n >= 6 & n <= 20)) {
           ans = "Weird";
         }else if((n % 2 == 0) && (n > 20 )) {
           ans = "Not Weird";
         }
         System.out.println(ans);
	}

}
