package bai4;

public class PersonAccount extends Account{
    protected double fee;

    private PersonAccount() {
    }

    public PersonAccount(double fee) {
        this.fee = fee;
    }

    public PersonAccount(double accountNo, String customerName, double balance, double fee) {
        super(accountNo, customerName, balance);
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    public void withDraw(double amount){
        setBalance(getBalance()-amount-fee);
    }
    public void deposit(double i){
        setBalance(getBalance()+fee);
    }

    @Override
    public String toString() {
        return "PersonAccount{" +
                "fee=" + fee +
                ", accountNo=" + accountNo +
                ", customerName='" + customerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
