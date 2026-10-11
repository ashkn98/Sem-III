import java.util.Scanner;
public class ashkn4 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = input.nextInt();
        
        System.out.println("Enter the elements of the array:  ");
        int arr[] = new int[n+1];
        for (int i=0; i<n; i++) {
            arr[i] = input.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];

        for (int i=0; i<n; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min) 
                min = arr[i];
        }

        System.out.println("---------------------------");
        System.out.println("The largest element is: " + max);
        System.out.println("The smallest element is: " + min);
    }
}
