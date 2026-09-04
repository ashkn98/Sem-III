import java.util.Scanner;
public class ashkn5 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        
        while (n >= 10) {
            int div = n/2;
            n = div;
            System.out.println(div);
        }
    }
}
