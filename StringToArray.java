//Java String Program to Convert String to String Array
public class StringToArray {
    public static void main(String[] args) {
        String str = "Ram,is,a,good,boy";
       
        String[] strArray = str.split(",");
        
        System.out.println("String array elements:");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }
}
