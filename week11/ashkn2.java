interface Account {
    void deposit();
    void withdraw();
    
    static void aboutBank() {
        System.out.println("> SBI Interface <" );
    }
    
    default void takeLoan() {
        System.out.println("Loan facility available for Savings account only.");
    }
}

class Saving implements Account {
    public void deposit() {
        System.out.println("Deposit in Savings account.");
    }
    
    public void withdraw() {
        System.out.println("Withdrawl in Savings account.");
    } 
    
    public void takeLoan(){
        System.out.println("Loan in Savings account.");
    }
}

class Current implements Account {
    public void deposit() {
        System.out.println("Deposit in Current account.");
    }
    
    public void withdraw() {
        System.out.println("Withdrawl in Current account.");
    } 
}

public class ashkn2 {
    public static void main(String args[]) {
        Account.aboutBank();
        
        System.out.println("-----------------------------");
        Saving s = new Saving();
        s.deposit();
        s.withdraw();
        s.takeLoan();
        
        System.out.println("-----------------------------");
        Current c = new Current();
        c.deposit();
        c.withdraw();
    }
}
