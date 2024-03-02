package bai4;

public class Account {
    protected double accountNo;
    protected String customerName;
    protected double balance;

    public Account() {
    }

    public Account(double accountNo, String customerName, double balance) {
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.balance = balance;
    }

    public double getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(double accountNo) {
        this.accountNo = accountNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", customerName='" + customerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
