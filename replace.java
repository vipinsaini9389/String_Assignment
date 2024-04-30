//Java String Program to Replace a Character at a Specific Index
public class replace {
	public static void main(String args[])
	{
		String str = "I just got a new phone";
		int index = 6;
		char ch = 'F';
		System.out.println("Original String = " + str);
		str = str.substring(0, index) + ch+ str.substring(index + 1);
		System.out.println("Modified String = " + str);
	}
}