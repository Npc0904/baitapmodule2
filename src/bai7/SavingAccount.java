package bai4;

public class SavingAccount extends Account {
    private double rate;
    private double period;

    public SavingAccount() {
    }
    public SavingAccount(double accountNo, String customerName, double balance, double rate, double period) {
        super(accountNo, customerName, balance);
        this.rate = rate;
        this.period = period;
    }
    public double getRate() {
        switch ((int) period) {
            case 1:
                return 5.0/100;
            case 3:
                return 5.5/100;
            case 6:
                return 6.0/100;
            case 12:
                return 7.0/100;
            case 24:
                return 7.5/100;
            case 36:
                return 8.0/100;
            default:
                return 1.8/100;
        }
    }
    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getPeriod() {
        return (int) period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public double interest() {
        return (getBalance() * getRate() * period) / 12.0;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "rate=" + rate +
                ", period=" + period +
                ", accountNo=" + accountNo +
                ", customerName='" + customerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
