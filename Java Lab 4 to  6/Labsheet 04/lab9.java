class Laptop {
    String brand="HP"; int RAM=8;
    static String os="Windows";
    void show(){
        String b=brand; int r=RAM;
        System.out.println(b+" "+r+"GB "+os);
    }
}
class Main {
    public static void main(String[] args){
        new Laptop().show();
    }
}