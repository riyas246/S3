import java.lang.*;
import java.util.*;
class palindrome
 {
    public static void main(String[] args) {
        String str, reverse = "";
        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter the string:");
        str = S1.nextLine();
        int length = str.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (reverse.equals(str)) {
            System.out.println("The string " +str+ " is a Palindrome");
        } else {
            System.out.println("The string " +str +" is not a Palindrome");
        }

        S1.close();
    }
}
