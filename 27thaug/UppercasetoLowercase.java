import java.util.*;

public class UppercasetoLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to convert to lowercase");
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            int asci = charArray[i];
            asci = asci | (1 << 5);
            charArray[i] = (char) asci;
        }

        String lowercaseString = new String(charArray);
        System.out.println(lowercaseString);
        sc.close();
    }
}