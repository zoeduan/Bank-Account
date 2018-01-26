package AccountPackage;
 
public class CheckingAccount extends BankAccount{
    
    private double checkingBalance;
    private static double checkingInterestRate = 0.01/100.0;

    public CheckingAccount(AccountNumber accountNumber, String accountHolder, double accountBalance){
            super(accountNumber, accountHolder, accountBalance);
            }
        
    public void addInterest(double checkingBalance){
            this.currentBalance += checkingBalance * checkingInterestRate;
            } 
}