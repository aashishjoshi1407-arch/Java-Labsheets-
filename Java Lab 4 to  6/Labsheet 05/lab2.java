class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    void setAccountNumber(int n) { accountNumber = n; }
    void setAccountHolder(String h) { accountHolder = h; }
    void setBalance(double b) { balance = b; }

    int getAccountNumber() { return accountNumber; }
    String getAccountHolder() { return accountHolder; }
    double getBalance() { return balance; }

    void deposit(double a) {
        if (a > 0) balance += a;
        else System.out.println("Invalid deposit");
    }

    void withdraw(double a) {
        if (a > 0 && a <= balance) balance -= a;
        else System.out.println("Invalid withdrawal");
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccountNumber(101);
        b.setAccountHolder("Aman");
        b.setBalance(1000);
        b.deposit(500);
        b.withdraw(200);
        System.out.println(b.getAccountHolder() + " " + b.getBalance());
    }
}