package AccountPackage;

import java.util.List;
import java.util.ArrayList;

public class BankAccount {

    private int accountNumber;
    private List<String> accountHolder = new ArrayList<String>();
    public double currentBalance;
    private double interestRate;
    private double interest;

    //Constructor
    public BankAccount(AccountNumber number, String accountHolder, double currentBalance){
        this.accountNumber = number.getAccountNumber();
        this.accountHolder.add(accountHolder);
        this.currentBalance = currentBalance;
    }
    
    //Get account number
    public int getAccountNumber(){
        return this.accountNumber;
    }

    //Add account holder
    public void addAccountHolder (String holderName) {
        this.accountHolder.add(holderName);
    }

    // Get account holder
    public String getAccountHolders(){
        StringBuffer sb = new StringBuffer();
        for (String holder : accountHolder){
            sb.append(holder).append(",");
        }
        return sb.delete(sb.length()-1, sb.length()).toString();
    }

    // Get current balance
    public double getCurrentBalance(){
        return this.currentBalance;
    }

    // Deposit money
    public void deposit(double inputMoney ) {
        this.currentBalance += inputMoney;
    }

    // Withdraw money
    public void withdraw (double outputMoney ) throws Exception {
        if (currentBalance < outputMoney){
            throw new Exception("Unable to withdraw $" + outputMoney +
            "because your current balance is $" + currentBalance);
        } else {
            this.currentBalance -= outputMoney;
        }
    }
    // Caculate interest
    public void addInterest(){ 
        interest = this.currentBalance * interestRate;   
        this.currentBalance += interest;
    }
}