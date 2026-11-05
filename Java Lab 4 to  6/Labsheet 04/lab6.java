class Car {
    String brand; int mileage;
    static int wheels=4;
    void show(){
        String b="Tata"; int m=20;
        brand=b;mileage=m;
        System.out.println(brand+" "+mileage+" "+wheels);
    }
}
class Main {
    public static void main(String[] args){
        new Car().show();
    }
}