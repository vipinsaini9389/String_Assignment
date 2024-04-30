//Java String Program to Splitting into a number of sub-strings
import java.util.Scanner;
class sub_strings{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int len = str.length()/num;
		int m=0;
		for(int i=1;i<=num;i++){
			for(int j=0;j<len;j++){
				System.out.print(str.charAt(m)+" ");
				m++;
			}
			System.out.println();
		}
	}
}