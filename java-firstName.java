package classwork;

public class firstName {
	
	String FirstName(String fullname) {
		int space = fullname.indexOf(" ");
		String word = fullname.substring(0, space);
		return word;
	}
	public static void main(String[] args) {
		System.out.println("My name is Anakin Skywalker.");
		firstName fName = new firstName();
		String result = fName.FirstName("Anakin Skywalker");
		
		System.out.println("\nfirst name: " + result);
	}

}
