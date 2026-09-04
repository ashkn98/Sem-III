
package ashkn1;

import java.util.Scanner;
public class ashkn2 {
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        int i;
        int sum=0;
        
        System.out.println("Enter elements of the array: ");
        for (i=0; i<n; i++) {
            arr[i] = input.nextInt();
        }
        
        System.out.println("-------------------------------");
        System.out.println("The sum of all the elements of the array are: ");
        for (i=0; i<n; i++) {
            sum = sum + arr[i];
        }

        System.out.print(sum);
    }
}
