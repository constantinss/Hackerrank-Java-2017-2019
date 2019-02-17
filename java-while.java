package classwork;

public class While {

	public static void main(String[] args) {
		String strArray[] = new String[10];
		int i = 0;
		
		while(i < 10) {
			strArray[i] = "number: " + i;
			i++;
		}
	
		do {
			i--;
			System.out.println(strArray[i]);
		}while(i > 0);
	}

}
