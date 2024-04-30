//Java String Program to Print even length words

import java.util.Scanner;

public class even_length_words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String[] words = str.split("\\s+");

        System.out.println("Even length words:");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }

        scanner.close();
    }
}
