package ashkn3;

public class Ashkn3 {

    public static void main(String args[]) {
        Account a = new Account();
        a.id = 34776;
        a.accountHolderName = "ABC";
        a.address = "District 9, NYC";
        
        a.deposit();
        a.withdraw();
        
        Account.calculateSimpleInterest(10000, 10, 2);
        Account.calculateCompoundInterest(10000, 10, 2);
    }
}
