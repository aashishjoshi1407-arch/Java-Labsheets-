class Main {
    public static void main(String[] args) {
        for(String n:new String[]{"Reader","Writer","Logger"})
            new Thread(() -> {
                try {
                    Thread.sleep((int)(Math.random()*501));
                } catch(Exception e) {}
                System.out.println(Thread.currentThread().getName()+" is working");
            },n).start();
    }
}