package AccountPackage;

public class AccountNumber{

    private static int firstAccountNumber = 100000;
    private int accountNumber;

    public AccountNumber(){
        this.accountNumber = firstAccountNumber++;
    }

    public int getAccountNumber(){
         return this.accountNumber;
    }
}