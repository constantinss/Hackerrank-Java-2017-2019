package elsys;
import java.util.Scanner;
import java.util.Stack;

public class stack {

	static boolean is_line_balanced(String param) {
		//more about https://www.tutorialspoint.com/java/java_stack_class.htm
		Stack<Character> stack = new Stack<Character>();
		
		for (int index = 0; index < param.length(); index++) {
			char ch = param.charAt(index);
			
			//https://stackoverflow.com/questions/23187539/java-balanced-expressions-check
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if (stack.empty()) {
				return false;
			} else {
				char top = stack.pop();
				if ((top == '(' && ch != ')') || (top == '[' && ch != ']')
						|| (top == '{' && ch != '}')) {
					return false;
				}
			}
		}
		return stack.empty();
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			System.out.println(is_line_balanced(in.next()));
		}
		in.close();
	}

}
