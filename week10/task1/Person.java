package ashkn1;

class Person {
    String name;
    int phone;
    
    class Address {
        int House_No;
        String street;
        String city;
        String state;
        
        void displayAddr() {
            System.out.println("Address: " + House_No + ", " + street + ", " + city + ", " + state);
        }
    }
    
    class DateOfBirth {
        int day;
        String month;
        int year;
        
        void displayDOB() {
            System.out.println("Date of Birth: " + day + "." + month + "." + year);
        }
    }
    
    Address a = new Address();
    DateOfBirth d = new DateOfBirth();
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        a.displayAddr();
        d.displayDOB();
    }
}
