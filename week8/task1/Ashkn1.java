package ashkn1;

import java.util.Scanner;
public class Ashkn1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        FRUIT f1 = new FRUIT();
        System.out.println("Enter details of 1st fruit: ");
        System.out.print("Color: ");
        f1.color = input.next();
        System.out.print("Taste: ");
        f1.taste = input.next();
        System.out.print("Price: ");
        f1.price = input.nextDouble();
        System.out.println();
        
        FRUIT f2 = new FRUIT();
        System.out.println("Enter details of 2nd fruit: ");
        System.out.print("Color: ");
        f2.color = input.next();
        System.out.print("Taste: ");
        f2.taste = input.next();
        System.out.print("Price: ");
        f2.price = input.nextDouble();
        System.out.println();
        
        FRUIT f3 = new FRUIT();
        System.out.println("Enter details of 3rd fruit: ");
        System.out.print("Color: ");
        f3.color = input.next();
        System.out.print("Taste: ");
        f3.taste = input.next();
        System.out.print("Price: ");
        f3.price = input.nextDouble();
        System.out.println();
        
        System.out.println("-------------------------------");
        System.out.println("Details of 1st fruit: ");
        f1.display();
        
        System.out.println("-------------------------------");
        System.out.println("Details of 2nd fruit: ");
        f2.display();
        
        System.out.println("-------------------------------");
        System.out.println("Details of 3rd fruit: ");
        f3.display();
    }
}
