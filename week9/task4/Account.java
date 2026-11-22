package ashkn4;

abstract class Account {
    int id;
    String accountHolderName;
    String address;

    public Account(int id, String accountHolderName, String address) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.address = address;
    }
    
    abstract void deposit();
    
    abstract void withdraw();
}
