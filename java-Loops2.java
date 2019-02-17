package homework;

import java.util.*;
import java.io.*;

public class Loops2 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int result = a;
	            int p = 1;
	            for (int j = 0; j < n; j++) {
					result += p*b;
					p = p*2;
					System.out.print(result + " ");
				}
	            System.out.println();
	        
	        }
	      in.close();
	}

}
