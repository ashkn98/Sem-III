interface Bike {
    void offer();
    default void details() {
        System.out.println("These are the details of Bike.");
    }
}

interface Scooty {
    void offer();
    default void details() {
        System.out.println("These are the details of Scooty.");
    }
}

class BuySomething implements Bike, Scooty {
    public void offer() {
        System.out.println("> Special Christmas Offer Available <");
    }
    public void details() {
        System.out.println("---------------------------------");
        Bike.super.details();
        System.out.println("------------------");
        Scooty.super.details();
    }
}
public class ashkn3 {
    public static void main(String args[]) {
        BuySomething b = new BuySomething();
        
        b.offer();
        b.details();
    }
}
