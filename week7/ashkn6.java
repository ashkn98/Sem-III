import java.util.Scanner;
public class ashkn6 {
    
    public static int fibR(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibR(n-1) + fibR(n-2);
    }
    
    public static void fib(int n) {
        int ft = 0;
        int st = 1;
        System.out.print(ft + " " + st + " ");
        for (int i=2; i<n; i++){
            int nt = ft + st;
            ft = st;
            st = nt;
            System.out.print(nt + " ");
        }
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the n-th term of the series: ");
        int n = input.nextInt();
        
        System.out.println("-----------------------------");
        System.out.println("Fibonacci series using recursion: ");
        for(int i=0; i<n; i++)
            System.out.print(fibR(i) + " ");
        
        System.out.println();
        
        System.out.println("-----------------------------");
        System.out.println("Fibonacci series without using recursion: ");
        fib(n);
    }
}
