package bai7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonAccount personAccount = new PersonAccount(99999, "acc1", 1000000, 500);
        personAccount.withDraw(500000);
        personAccount.deposit(1000000);
        System.out.println("Depositor Information: " + personAccount);
        SavingAccount savingAccount = new SavingAccount(11111, "acc2", 999999, 0, 0);
        savingAccount.setRate(6.5);
        System.out.println("Savings Account Information: " + savingAccount);
        System.out.println("Interest Rate After 12 Months: " + savingAccount.interest());
    }
}