class Main {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            final int n=i;
            Thread t=new Thread(() -> System.out.println("Thread "+n+" finished"));
            t.setPriority(1+(n-1)*2);
            t.start();
        }
    }
}