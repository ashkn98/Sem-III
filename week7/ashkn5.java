import java.util.Scanner;
public class ashkn5 {
    
    public static int fact(int n) {
        if (n == 0)
            return 1;
        return n*fact(n-1);
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int n = input.nextInt();
        
        System.out.println("-----------------------------");
        System.out.println("The factorial of " + n + " is " + fact(n));
    }
}
