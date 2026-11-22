package ashkn3;

public class Ashkn3 {

    static void minMaxAdd(int a, int b) {
        if (a<b) {
            System.out.println("Minimum: " + a);
            System.out.println("Maximum: " + b);
        }
        else {
            System.out.println("Minimum: " + b);
            System.out.println("Maximum: " + a);
        }
        System.out.println("Addition: " + (a+b));
    }
    
    static void minMaxAdd(double a, double b) {
        if (a<b) {
            System.out.println("Minimum: " + a);
            System.out.println("Maximum: " + b);
        }
        else {
            System.out.println("Minimum: " + b);
            System.out.println("Maximum: " + a);
        }
        System.out.println("Addition: " + (a+b));
    }
    
    static void minMaxAdd(String a, String b) {
        if (a.compareToIgnoreCase(b) == 0) {
            System.out.println("Minimum: " + a);
            System.out.println("Maximum: " + b);
        }
        else {
            System.out.println("Minimum: " + b);
            System.out.println("Maximum: " + a);
        }
        System.out.println("Addition: " + (a+b));
    }
    
    public static void main(String args[]) {
        System.out.println("Integers:");
        minMaxAdd(23, 54);
        
        System.out.println("----------------------");
        System.out.println("Real Numbers:");
        minMaxAdd(87.3, 56.5);
        
        System.out.println("----------------------");
        System.out.println("Characters:");
        minMaxAdd("ragdoll", "cat");
    }
}
