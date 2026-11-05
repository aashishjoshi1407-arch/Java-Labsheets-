class BankAccount {
    double balance=1000;
    static String bankCode="SBI001";
    void withdraw(double amount){
        double a=amount;
        if(a>0&&a<=balance)balance-=a;
        else System.out.println("Invalid amount");
        System.out.println(bankCode+" Balance: "+balance);
    }
}
class Main {
    public static void main(String[] args){
        new BankAccount().withdraw(500);
    }
}