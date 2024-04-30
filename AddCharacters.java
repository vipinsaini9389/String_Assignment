//Java String Program to  Add Characters to a String
public class AddCharacters {
    public static void main(String[] args) {
        String string = "Vipin";
        char newChar = '@';
        
        
        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer.append(newChar);
        
        String newString = stringBuffer.toString();
        System.out.println("string: " + string);
        System.out.println("New string: " + newString);
    }
}
