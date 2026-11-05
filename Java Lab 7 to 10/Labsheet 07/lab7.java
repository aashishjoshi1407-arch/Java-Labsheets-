class Main {
    public static void main(String[] args) throws Exception {
        Thread t=new Thread(() -> {
            int s=0;
            for(int i=1;i<=10000;i++) s+=i;
            System.out.println("Sum = "+s);
        });
        t.start();
        t.join();
        System.out.println("Task finished");
    }
}