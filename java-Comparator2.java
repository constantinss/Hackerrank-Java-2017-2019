package homework;
import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Checker implements Comparator {
	public int compare(Object o1, Object o2) {
		obj p1 = (obj) o1;
		obj p2 = (obj) o2;
		
		if (p1.score == p2.score) {
			return p1.name.compareTo(p2.name);
		}
		else if (p1.score < p2.score) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
class obj{
    String name;
    int score;
    
    obj(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class Comparator2 {

	public static void main(String[] args) {
		 	Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();

	        Player player[] = new Player[n];
	        Checker checker = new Checker();
	        
	        for(int i=0; i < n; i++){
	            player[i] = new Player(scan.next(), scan.nextInt());
	        }
	        scan.close();
	     
	        Arrays.sort(player, checker);
	        for(int i = 0; i < player.length; i++){
	            System.out.printf("%s %s\n", player[i].name, player[i].score);
	        }

	}

}
