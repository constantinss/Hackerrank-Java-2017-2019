package classwork;

public class For {

	public static void main(String[] args) {
		String strArray[] = new String[10];
		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = "number: " + i;
		}
		
		for(String str:strArray) {
			System.out.println(str);
		}
	}

}
