//Java String Program to Reverse a String Using Stacks
import java.util.Stack;

public class StringUsing_stack_Reverse {

	public static void main(String[] args) {
		String str ="VIPIN";
		Stack<Character> sb =new Stack<>();
		for(int i=0;i<str.length();i++) {
			sb.push(str.charAt(i));
			while(!sb.isEmpty()) {
				System.out.print(sb.pop());
			}
		}
	}

}