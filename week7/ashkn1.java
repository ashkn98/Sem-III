import java.util.Scanner;
public class ashkn1 {
    
    public static int bSearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = (start+end)/2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                start = mid + 1;
            else
                end = mid-1;
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = input.nextInt();
        
        System.out.println("Enter the elements of the array (in sorted order): ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = input.nextInt();
        }
        
        System.out.println("Enter the element to search for: ");
        int key = input.nextInt();
        
        int search = bSearch(arr, key);
        
        System.out.println("------------------------------------------");
        if (search == -1)
            System.out.println("Element does not exist in the array.");
        else
            System.out.println("The element " + key + " was found in the array at the index " + search);
    }
}
