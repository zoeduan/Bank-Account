 package AccountPackage;
 
 public class SavingAccount extends BankAccount{
     
    private double savingBalance;
    
    private static double savingInterestRate1 = 0.01/100;
    private static double savingInterestRate2 = 0.05/100;
    private static double savingInterestRate3 = 0.1/100;

    public SavingAccount(AccountNumber accountNumber, String accountHolder, double iniBalance){
            super(accountNumber, accountHolder, iniBalance);
        if (iniBalance < 100){
            System.out.println("Initial Deposit should be bigger than or equal to $100");
            this.currentBalance = 0.00;
            }else{
                this.currentBalance =  iniBalance;
                }
    }
    
    public void addInterest(double savingBalance){
        if (savingBalance < 2000)
            this.currentBalance += savingBalance * savingInterestRate1;
        else if (savingBalance >= 2000 & savingBalance < 12000)
            this.currentBalance += savingBalance * savingInterestRate2;
        else this.currentBalance += savingBalance * savingInterestRate3;
    }

    public void withdraw(double outputMoney) throws Exception {           
        if ((currentBalance - outputMoney) < 100){
            throw new Exception("Unable to withdraw $" + outputMoney +
            " The balance is insufficient to perform the withdrawal, for the minimul balance should be greater than or equal to $100" );
        } else {
            currentBalance -= outputMoney;
        }
    }
}