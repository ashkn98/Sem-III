import java.util.Scanner;
public class ashkn6 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = input.nextInt();
        
        System.out.println("Enter the elements of the array: ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = input.nextInt();
        }
        
        System.out.println("Enter the element to search: ");
        int key = input.nextInt();
        
        int search = -1;
        for (int j=0; j<n; j++) {
            if (arr[j] == key) 
                search = j;
        }
        
        System.out.println("---------------------------------------------------------");
        if (search != -1)
            System.out.println("The element " + key + " was found at index " + search);
        else
            System.out.println("The element does not exist in the array.");
    }
}
