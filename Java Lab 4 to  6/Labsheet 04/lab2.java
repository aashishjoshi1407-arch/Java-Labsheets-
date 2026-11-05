class Rectangle {
    int length=5,breadth=4;
    static String shapeName="Rectangle";
    void area(){
        int a=length*breadth;
        System.out.println(shapeName+" Area: "+a);
    }
}
class Main {
    public static void main(String[] args){
        new Rectangle().area();
    }
}