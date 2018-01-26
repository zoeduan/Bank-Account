//package AccountPackage;
https://coderanch.com/t/396515/java/Creating-unique-random-number
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class AccountNumber extends BankAccount{
    public int accountNumber;
    public boolean newRandom;
    public List<Integer> accountNumberList = new ArrayList<Integer>();
    Random generator = new Random();

    public AccountNumber(int accountNumber){
        super(accountNumber);
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(){    
        this.accountNumber = accountNumber;
        accountNumberList.add(accountNumber);

        do{
            newRandom = false;
        for (int x = 0; x < accountNumberList.size(); x++){
            if (accountNumber == accountNumberList.get(x)){
                accountNumber = generator.nextInt(89999);
                accountNumber = accountNumber + 10000;
                newRandom = true;
                }
            }
        } while (newRandom == true);
    }
}