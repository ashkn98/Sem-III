package ashkn2;

class Edible {
    static class Fruit {
        static void fruitDetails() {
            System.out.println("Fruits are sweet and colorful.");
        }
        
        void fruitPackaging() {
            System.out.println("Fruits are packaged carefully to avoid damage.");
        }
    }
    
    static class Vegetable {
        static void vegetableDetails() {
            System.out.println("Vegetables are full of healthy nutrients.");
        }
        
        void vegetablePackaging() {
            System.out.println("Vegetable are packaged in sacks.");
        }
    }
    
    public static void main(String args[]) {
        Fruit.fruitDetails();
        Fruit f = new Fruit();
        f.fruitPackaging();
        
        System.out.println("------------------------------------");
        
        Vegetable.vegetableDetails();
        Vegetable v = new Vegetable();
        v.vegetablePackaging();
    }
}
