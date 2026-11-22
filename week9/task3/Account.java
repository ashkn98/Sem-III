package ashkn3;

class Account {
    int id;
    String accountHolderName;
    String address;
    
    void deposit() {
        System.out.println("The account holder deposited an amount.");
    }
    
    void withdraw() {
        System.out.println("The account holder withdrawed an amount.");
    }
    
    static void calculateSimpleInterest(double p, double r, double t) {
        double si = (p*r*t)/100;
        System.out.println("The simple interest is: " + si);
    }
    
    static void calculateCompoundInterest(double p, double r, double t) {
        double ci = (p * Math.pow((1 + (r/100)), t)) - p;
        System.out.println("The compund interest is: " + ci);
    }
}
