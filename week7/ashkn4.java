import java.util.Scanner;
public class ashkn4 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String s = input.next();
        
        int n = s.length();
        String rev = "";
        
        for(int i=n-1; i>=0; i--)
            rev = rev + s.charAt(i);
        
        System.out.println("------------------------------");
        if (s.compareToIgnoreCase(rev) == 0) 
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string is not a palindrome.");
    }
}
