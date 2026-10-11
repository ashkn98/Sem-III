import java.util.Scanner;
public class ashkn3 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = input.nextInt();
        
        System.out.println("Enter the elements of the array:  ");
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = input.nextInt();
        }
        int size = arr.length - 1;
        
        System.out.println("Array before swapping: ");
        for (int e:arr) {
            System.out.print(e + " ");
        }
        
        int temp = arr[0];
        arr[0] = arr[size];
        arr[size] = temp;
        
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Array after swapping: ");
        for (int e:arr) {
            System.out.print(e + " ");
        }
    }
}
