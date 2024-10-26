package dz4;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String surname;

    public BankAccount(int accountNumber, double balance, String surname) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.surname = surname;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(1, 12022, "John");
        System.out.println(ba1.getBalance());
        ba1.deposit(200);
        ba1.withdraw(100);
        System.out.println(ba1.getBalance());

        System.out.println();

        BankAccount ba2 = new BankAccount(2, 17167, "Jane");
        System.out.println(ba2.getBalance());
        ba2.deposit(400);
        ba2.withdraw(500);
        System.out.println(ba2.getBalance());
    }
}