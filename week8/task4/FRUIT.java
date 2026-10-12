package ashkn4;

class FRUIT {
    
    private String color;
    private String taste;
    private double price;

    FRUIT(String color) {
        this.color = color;
    } 
    
    FRUIT(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    FRUIT(String color, String taste, double price) {
        this.color = color;
        this.taste = taste;
        this.price = price;
    }
    
    FRUIT() {
        this.color = "null";
        this.taste = "null";
        this.price = 0;
    }
    
    void display() {
        System.out.println("The color is " + this.color);
        System.out.println("The taste is " + this.taste);
        System.out.println("The price is " + this.price);
    }
}
