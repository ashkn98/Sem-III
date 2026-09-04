
package ashkn1;

import java.util.Scanner;
public class ashkn4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = input.nextInt();
        int i;
        double sum=0;
        
        System.out.println("-------------------------");
        for(i=1; i<=n; i++) {
            sum = sum + (1.0/i);
        }
        
        System.out.println("The sum is " + sum);
    }
}
