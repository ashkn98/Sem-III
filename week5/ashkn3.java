import java.util.Scanner;
public class ashkn3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = input.nextInt();
        int i, j, k;
        
        System.out.println("-------------------------");
        for(i=1; i<=n; i++) {
            for(j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            
            for(k=1; k<=i; k++){
                System.out.print(" " + k);
            }
            
            System.out.println();
        }
    }
}
