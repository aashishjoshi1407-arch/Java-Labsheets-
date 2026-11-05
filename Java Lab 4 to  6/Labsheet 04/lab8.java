class Pen {
    String color="Blue",type="Gel";
    static String manufacturer="Cello";
    void show(){
        String c=color,t=type;
        System.out.println(c+" "+t+" "+manufacturer);
    }
}
class Main {
    public static void main(String[] args){
        new Pen().show();
    }
}