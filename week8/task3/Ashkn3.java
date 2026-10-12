package ashkn3;

import java.util.Scanner;
public class Ashkn3 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter details of a fruit: ");
        System.out.print("Color: ");
        String color = input.next();
        System.out.print("Taste: ");
        String taste = input.next();
        System.out.print("Price: ");
        double price = input.nextDouble();
        FRUIT f1 = new FRUIT(color, taste, price);
        System.out.println();
        
        System.out.println("-------------------------------");
        System.out.println("Details of the fruit: ");
        f1.display();
    }
}
