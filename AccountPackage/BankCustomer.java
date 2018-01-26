package AccountPackage;

public class BankCustomer{
    private String customerName;

    public BankCustomer(String customerName){
        this.customerName = customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }
}