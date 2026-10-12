package ashkn2;

import java.util.Scanner;
public class Ashkn2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        FRUIT f1 = new FRUIT();
        System.out.println("Enter details of 1st fruit: ");
        System.out.print("Color: ");
        String color = input.next();
        System.out.print("Taste: ");
        String taste = input.next();
        System.out.print("Price: ");
        double price = input.nextDouble();
        f1.setDetails(color, taste, price);
        System.out.println();
        
        FRUIT f2 = new FRUIT();
        System.out.println("Enter details of 2nd fruit: ");
        System.out.print("Color: ");
        String color2 = input.next();
        System.out.print("Taste: ");
        String taste2 = input.next();
        System.out.print("Price: ");
        double price2 = input.nextDouble();
        f2.setDetails(color2, taste2, price2);
        System.out.println();
        
        FRUIT f3 = new FRUIT();
        System.out.println("Enter details of 3rd fruit: ");
        System.out.print("Color: ");
        String color3 = input.next();
        System.out.print("Taste: ");
        String taste3 = input.next();
        System.out.print("Price: ");
        double price3 = input.nextDouble();
        f3.setDetails(color3, taste3, price3);
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
