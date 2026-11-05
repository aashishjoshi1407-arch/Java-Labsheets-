class Main {
    public static void main(String[] args) throws Exception {
        Thread t=new Thread(() -> {
            try { Thread.sleep(500); }
            catch(Exception e) {}
        });
        System.out.println(t.isAlive());
        t.start();
        Thread.sleep(100);
        System.out.println(t.isAlive());
        t.join();
        System.out.println(t.isAlive());
    }
}