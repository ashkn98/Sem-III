import java.util.Scanner;
public class ashkn3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int i;
        
        for(i=1; i<=10; i++) {
            System.out.println(n*i);
        }
    }
}

