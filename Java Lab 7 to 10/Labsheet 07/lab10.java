class Main {
    static int balance=2000;
    static void withdraw() {
        if(balance>0) balance--;
    }
    public static void main(String[] args) throws Exception {
        Runnable r=() -> {
            for(int i=0;i<1000;i++) withdraw();
        };
        Thread a=new Thread(r),b=new Thread(r);
        a.start(); b.start();
        a.join(); b.join();
        System.out.println("Balance = "+balance);
    }
}