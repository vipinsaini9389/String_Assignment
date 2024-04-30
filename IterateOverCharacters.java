//Java String Program to Iterate Over Characters in String
public class IterateOverCharacters {
    public static void main(String[] args) {
        String str = "Vipin, Saini!";
        
        
        System.out.println("Iterating over each character using a for loop:");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
