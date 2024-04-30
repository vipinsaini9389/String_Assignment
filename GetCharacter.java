//Java String Program to Get a Character From the Given String
import java.util.Scanner;

public class GetCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the position of the character to retrieve: ");
        int position = scanner.nextInt();

        char character = getCharacter(str, position);

        if (character != '0') {
            System.out.println("Character at position " + position + ": " + character);
        } else {
            System.out.println("Invalid position");
        }

        scanner.close();
    }

    public static char getCharacter(String str, int position) {
        if (position >= 0 && position < str.length()) {
            return str.charAt(position);
        } else {
            return '0'; // Null character represents an invalid position
        }
    }
}
