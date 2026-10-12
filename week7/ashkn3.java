import java.util.Scanner;
public class ashkn3 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String s = input.next();
        
        int n = s.length();
        String rev = "";
        
        for(int i=n-1; i>=0; i--)
            rev = rev + s.charAt(i);
        
        System.out.println("------------------------------");
        System.out.println("The reversed string is: " + rev);
    }
}
