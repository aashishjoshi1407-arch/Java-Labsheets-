class Main {
    public static void main(String[] args) {
        for(int i=1;i<=2;i++) {
            final int n=i;
            new Thread(() -> {
                for(int j=1;j<=5;j++)
                    System.out.println("Thread-"+n+": "+j);
            }).start();
        }
    }
}