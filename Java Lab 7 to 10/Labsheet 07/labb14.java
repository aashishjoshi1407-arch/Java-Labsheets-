class Main {
    static Object a=new Object(),b=new Object();
    public static void main(String[] args) {
        Thread t1=new Thread(() -> {
            synchronized(a) {
                synchronized(b) {
                    System.out.println("Thread 1");
                }
            }
        });
        Thread t2=new Thread(() -> {
            synchronized(b) {
                synchronized(a) {
                    System.out.println("Thread 2");
                }
            }
        });
        t1.start();
        t2.start();
    }
}