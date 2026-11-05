class Main {
    public static void main(String[] args) {
        Thread a=new Thread(),b=new Thread();
        a.setPriority(10);
        b.setPriority(1);
        System.out.println(a.getPriority());
        System.out.println(b.getPriority());
        a.start();
        b.start();
    }
}