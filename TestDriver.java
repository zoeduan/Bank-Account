import AccountPackage.*;

public class TestDriver{

    public static void main (String[] args){
        BankCustomer checkingBankCustomer = new BankCustomer("Julio Perez");
        AccountNumber checkingAccountNumber = new AccountNumber(checkingBankCustomer);
        double iniCheckingBalance = 0.0;
        
        /*  A checking account for Julio Perez */
        System.out.println("======Checking account for Julio Perez======");
        CheckingAccount checkingAccount = new CheckingAccount (checkingAccountNumber.getAccountNumber(), checkingBankCustomer.getCustomerName(), iniCheckingBalance );

        System.out.printf("Account Information :\n"+
                "Account Number : %d\n"+
                "Account Holders : %s\n" +
                "Current Balance : $%.2f\n\n",
                checkingAccount.getAccountNumber(),
                checkingAccount.getAccountHolders(),
                checkingAccount.getCurrentBalance());

        // Deposit 1500 
        System.out.println("Deposit 1500:");
        checkingAccount.deposit(1500);
        System.out.printf("Current balance : $%.2f\n\n", checkingAccount.getCurrentBalance()); 
        
        // Withdraw 150
        System.out.println("Withdraw 150:");
        try{
            checkingAccount.withdraw(150);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.printf("Current balance : $%.2f\n\n", checkingAccount.getCurrentBalance()); 
        
        // Perform interest accumulation
        System.out.println("Perform interest accumulation");
        checkingAccount.addInterest(checkingAccount.getCurrentBalance()); 
        System.out.printf("Current balance : $%.2f\n\n", checkingAccount.getCurrentBalance()); 
        
        // Withdraw 750
        System.out.println("Withdraw 750:");
        try{
            checkingAccount.withdraw(750);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.printf("Current balance : $%.2f\n\n", checkingAccount.getCurrentBalance()); 
        
        // Perform interest accumulation
        System.out.println("Perform interest accumulation");
        checkingAccount.addInterest(checkingAccount.getCurrentBalance()); 
        System.out.printf("Current balance : $%.2f\n\n", checkingAccount.getCurrentBalance()); 


        /*  A saving account for Sasha Ivanov */
        BankCustomer savingBankCustomer = new BankCustomer("Sasha Ivanov");
        AccountNumber savingAccountNumber = new AccountNumber(savingBankCustomer);
        double iniSavingBalance = 600.00;

        System.out.println("======Saving account for Sasha Ivanov======");
        SavingAccount savingAccount = new SavingAccount(savingAccountNumber.getAccountNumber(), savingBankCustomer.getCustomerName(), iniSavingBalance);

        System.out.printf("Account Information :\n"+
                "Account Number : %d\n"+
                "Account Holders : %s\n" +
                "Current Balance : $%.2f\n\n",
                savingAccount.getAccountNumber(),
                savingAccount.getAccountHolders(),
                savingAccount.getCurrentBalance());

        System.out.println("Perform interest accumulation");
        savingAccount.addInterest(savingAccount.getCurrentBalance());
        System.out.printf("Current balance : $%.2f\n\n", savingAccount.getCurrentBalance());

        // Deposit 150 
        System.out.println("Deposit 150:");
        savingAccount.deposit(150);
        System.out.printf("Current balance : $%.2f\n\n", savingAccount.getCurrentBalance());

        System.out.println("Perform interest accumulation");
        savingAccount.addInterest(savingAccount.getCurrentBalance());
        System.out.printf("Current balance : $%.2f\n\n", savingAccount.getCurrentBalance());

         // Withdraw 600
        System.out.println("Withdraw 600:");
        try{
            savingAccount.withdraw(600);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.printf("Current balance : $%.2f\n\n", savingAccount.getCurrentBalance());
    }
}

