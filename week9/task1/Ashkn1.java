package ashkn1;

public class Ashkn1 {
    
    public static void main(String[] args) {
        
        Bus b = new Bus();
        b.setPrice(500);
        System.out.println("--------------------");
        b.display();
        b.cost();
        
        Train t = new Train();
        t.setPrice(1000);
        System.out.println("--------------------");
        t.display();
        t.cost();
    }
}
