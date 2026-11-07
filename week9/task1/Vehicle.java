package ashkn1;

class Vehicle {
    
   int price;

    public void setPrice(int price) {
        this.price = price;
    }
    
    void cost() {
        System.out.println("The cost for one way ticket is Rs. " + price);
    }
}
