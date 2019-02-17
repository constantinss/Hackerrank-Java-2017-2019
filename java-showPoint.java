package classwork;

import java.awt.Point;

public class showPoint {
	private double x;
	private double y;
	
	public static void main(String[] args) {
		showPoint myPoint = new showPoint();
		myPoint.x = 10.0;
		myPoint.y = 15.0;
		
		System.out.print("myPoint ");
		System.out.print("( " + myPoint.x + ", ");
		System.out.println(myPoint.y + " );");
	}

}
