//Java String Program to Insert a string into another string
public class Insert_a_string {
    public static void main(String[] args) {
        String string = "Hello, world!";
        String Insert = "beautiful ";

        int index = 7; // Index at which to insert the string

        String newString = insertString(string, Insert, index);
        System.out.println("Original string: " + string);
        System.out.println("String to insert: " + Insert);
        System.out.println("New string: " + newString);
    }

    public static String insertString(String string, String Insert, int index) {
        if (index > string.length()) {
            return string + Insert;
        }

        return string.substring(0, index) + Insert + string.substring(index);
    }
}
