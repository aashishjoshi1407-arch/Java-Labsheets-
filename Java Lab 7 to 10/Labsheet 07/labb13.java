class Main {
    static int value;
    static boolean ready=false;
    static synchronized void put(int n) throws Exception {
        while(ready) Main.class.wait();
        value=n;
        ready=true;
        Main.class.notifyAll();
    }
    static synchronized int get() throws Exception {
        while(!ready) Main.class.wait();
        ready=false;
        Main.class.notifyAll();
        return value;
    }
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                for(int i=1;i<=10;i++) put(i);
            } catch(Exception e) {}
        }).start();

        new Thread(() -> {
            try {
                for(int i=1;i<=10;i++)
                    System.out.println(get());
            } catch(Exception e) {}
        }).start();
    }
}