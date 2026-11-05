class Product {
    int id=101; String name="Pen"; double price=100;
    static double discountRate=10;
    void calculate(){
        double p=price-price*discountRate/100;
        System.out.println(id+" "+name+" Final Price: "+p);
    }
}
class Main {
    public static void main(String[] args){
        new Product().calculate();
    }
}