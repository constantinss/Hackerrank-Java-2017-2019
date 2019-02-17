package homework;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Static_Initializer_Block {
	static boolean flag;
    static int H;
	static int B;

	static {
		Scanner readLine = new Scanner(System.in);
		B = readLine.nextInt();
		H = readLine.nextInt();
		if (B > 0 && H > 0) {
			flag = true;
		} else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			flag = false;
		}
		readLine.close();
	}

	public static void main(String[] args) {
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}

}
