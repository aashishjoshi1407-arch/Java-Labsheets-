class BankAccount {
    int accountNumber=123;
    double balance=1000;
    static String bankName="SBI";
    void deposit(double amount){
        double a=amount;
        balance+=a;
        System.out.println(accountNumber+" "+bankName+" Balance: "+balance);
    }
}
class Main {
    public static void main(String[] args){
        new BankAccount().deposit(500);
    }
}