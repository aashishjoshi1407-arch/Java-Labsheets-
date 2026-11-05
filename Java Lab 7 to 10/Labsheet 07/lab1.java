class Main extends Thread {
    public void run() {
        try {
            for(int i=1;i<=5;i++) {
                System.out.println("Aman Singh");
                Thread.sleep(200);
            }
        } catch(Exception e) {}
    }
    public static void main(String[] args) {
        new Main().start();
    }
}