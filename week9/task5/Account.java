package ashkn5;

abstract class Account {
    int id;
    String accountHolderName;
    String address;
    double balance;

    Account(int id, String accountHolderName, String address, double balance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.balance = balance;
    }
    
    abstract void deposit(double amount);
    
    abstract void withdraw(double amount);
}
