package ashkn1;

public class Ashkn1 {
    public static void main(String args[]) {
        Person p = new Person();
        p.name = "Yusra";
        p.phone = 318207992;
        
        p.a.House_No = 4412;
        p.a.street = "Miroh Street";
        p.a.city = "NYC";
        p.a.state = "UP";
        
        p.d.day = 10;
        p.d.month = "February";
        p.d.year = 2007;
        
        p.display();
    }
}
