package elsys;

import java.util.LinkedList;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
  		Scanner num = new Scanner(System.in);
        //LinkedList
		LinkedList<Integer> list = new LinkedList<Integer>();
		//first n
        int line = num.nextInt();
        
		for (int i = 0; i < line; i++) {
			//values
            int v = num.nextInt();
			list.add(v);
		}
        //numbers to insert
		int nus = num.nextInt();
		for (int i = 0; i < nus; i++) {
			String act = num.next();
			if(act.equals("Insert")) {
				int index = num.nextInt();
				int value = num.nextInt();
				list.add(index, value);
			} else if(act.equals("Delete")){
				int index = num.nextInt();
				list.remove(index);
			}
		}
		num.close();
    // show everything
	for (Integer n : list) 
		System.out.print(n + " ");
		
	}

}
