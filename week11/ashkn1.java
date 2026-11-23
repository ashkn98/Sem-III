interface Account {
    void deposit();
    void withdraw();
    
    static void aboutBank() {
        System.out.println("> SBI Interface <" );
    }
}

class Saving implements Account {
    public void deposit() {
        System.out.println("Deposit in Savings account.");
    }
    
    public void withdraw() {
        System.out.println("Withdrawl in Savings account.");
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

public class ashkn1 {
    public static void main(String args[]) {
        Account.aboutBank();
        
        System.out.println("-----------------------------");
        Saving s = new Saving();
        s.deposit();
        s.withdraw();
        
        System.out.println("-----------------------------");
        Current c = new Current();
        c.deposit();
        c.withdraw();
    }
}
