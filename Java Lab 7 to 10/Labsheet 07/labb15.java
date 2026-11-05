class Main {
    static Object a=new Object(),b=new Object();
    public static void main(String[] args) {
        Runnable r=() -> {
            synchronized(a) {
                synchronized(b) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        };
        new Thread(r,"Thread 1").start();
        new Thread(r,"Thread 2").start();
    }
}