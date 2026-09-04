
package ashkn1;

import java.util.Scanner;
public class ashkn5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = input.nextInt();
        int sum=0;
        
        System.out.println("-------------------------");
        while (n>0) {
            int ln = n%10;
            n = n/10;
            sum = sum+ln;
        }
        
        System.out.println("The sum is " + sum);
    }
}
