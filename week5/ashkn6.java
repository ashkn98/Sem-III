import java.util.Scanner;
public class ashkn6 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = input.nextInt();
        int fact=1;
        int i;
        
        System.out.println("-------------------------");
        for(i=1; i<=n; i++){
            fact = fact*i;
        }
        
        System.out.println("The factorial is " + fact);
    }
}
