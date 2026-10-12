import java.util.Scanner;
public class ashkn2 {
    
    public static void sort(int arr[]) {
        for (int i=0; i<(arr.length-1); i++) {
            for (int j=0; j<(arr.length-1-i); j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = input.nextInt();
        
        System.out.println("Enter the elements of the array: ");
        int arr[] = new int[n];
        for (int i=0; i<n; i++) 
            arr[i] = input.nextInt();
        
        sort(arr);
        
        System.out.println("------------------------------------------");
        System.out.println("Array after sorting: ");
        for (int e:arr)
            System.out.print(e + " ");
    }
}
