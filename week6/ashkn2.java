import java.util.Scanner;
public class ashkn2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        boolean isPrime = true;
        
        for(int i = 2; i<=(Math.sqrt(n)); i++){
            if (n%i == 0){
                isPrime = false;
                break;
            }
        }
        
        System.out.println("-----------------------");
        if(isPrime)
            System.out.println("The number is prime.");
        else
            System.out.println("The number is not prime.");
    }
}
