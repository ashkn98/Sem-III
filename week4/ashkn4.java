import java.util.Scanner;
public class ashkn4 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int i;
        int sum = 0;
        
        for(i=1; i<=n; i++) {
            sum = sum + i;
        }
        
        System.out.println("The final sum is " + sum);
    }
}
