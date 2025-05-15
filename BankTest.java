
import java.util.Scanner;

class BankAccount {
    public float intialbalance, db, wd;

    void deposite() {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter deposited amount:");
        db = sc.nextFloat();
        intialbalance += db;
        System.err.println("Balance: " + intialbalance);
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter withdraw amount: ");
        wd = sc.nextFloat();

        intialbalance = intialbalance - wd;
        System.err.println("Balance: " + intialbalance);
    }
}

class savingAccount extends BankAccount {
    @Override
    void withdraw() {
        Scanner sc = new Scanner(System.in);
        if (intialbalance <= 100) {
            System.err.println("Your balanace is less than 100 so you can not withdraw");
        } else {
            System.err.println("Enter withdraw amount: ");
            wd = sc.nextFloat();
            intialbalance = intialbalance - wd;
            System.err.println("Balance: " + intialbalance);
        }
    }
}

public class BankTest{
    public static void main(String[] args) {
        savingAccount s1 = new savingAccount();
        s1.deposite();
        s1.deposite();
        s1.withdraw();
        s1.withdraw();
    }
}