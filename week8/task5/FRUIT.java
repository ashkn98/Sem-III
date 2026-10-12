package ashkn5;

class FRUIT {
    
    private String color;
    private String taste;
    private double price;
    
    FRUIT() {
        this("null", "null", 0);
    }
    
    FRUIT(String color) {
        this(color, "null", 0);
    }
    
    FRUIT(String color, String taste) {
        this(color, taste, 0);
    }
    
    FRUIT(String color, String taste, double price) {
        this.color = color;
        this.taste = taste;
        this.price = price;
    }
    
    void display() {
        System.out.println("The color is " + this.color);
        System.out.println("The taste is " + this.taste);
        System.out.println("The price is " + this.price);
    }
}
