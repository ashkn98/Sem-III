package ashkn5;

public class Ashkn5 {

    public static void main(String args[]) {
        System.out.println("----------------------------------------------");
        System.out.println("Savings Account: ");
        Saving s = new Saving(5000, 45567, "ABC", "District 9", 90000);
        s.display();
        s.deposit(3000);
        s.withdraw(1500);
        
        System.out.println("----------------------------------------------");
        System.out.println("Current Account: ");
        Current c = new Current(5000, 34566, "XYZ", "District 8", 10000);
        c.display();
        c.deposit(5000);
        c.withdraw(2000);
    }
}
