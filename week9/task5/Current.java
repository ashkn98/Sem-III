package ashkn5;

class Current extends Account {
    double max_withdrawl_limit;

    Current(double max_withdrawl_limit, int id, String accountHolderName, String address, double balance) {
        super(id, accountHolderName, address, balance);
        this.max_withdrawl_limit = max_withdrawl_limit;
    }
    
    void display() {
        System.out.println("Account ID: " + id);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
        System.out.println("Maximum withdrawl limit: " + max_withdrawl_limit);
    }
    
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " +amount);
    }
    
    void withdraw(double amount) {
        if ((amount <= balance) && (amount <= max_withdrawl_limit)) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
        else
            System.out.println("Withdrawl limit exceeded.");
    }
}
