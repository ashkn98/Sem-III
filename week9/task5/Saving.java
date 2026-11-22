package ashkn5;

class Saving extends Account{
    double min_balance;

    Saving(double min_balance, int id, String accountHolderName, String address, double balance) {
        super(id, accountHolderName, address, balance);
        this.min_balance = min_balance;
    }
    
    void display() {
        System.out.println("Account ID: " + id);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
        System.out.println("Minimum balance: " + min_balance);
    }
    
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }
    
    void withdraw(double amount) {
        if ((balance - amount) >= min_balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
        else
            System.out.println("Minimum balance not maintained.");
    }
}
