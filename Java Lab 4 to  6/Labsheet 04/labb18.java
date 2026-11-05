class ElectricBill {
    int units=100;
    static double fixedCharge=50;
    void calculate(){
        double rate=5,bill=units*rate+fixedCharge;
        System.out.println("Bill: "+bill);
    }
}
class Main {
    public static void main(String[] args){
        new ElectricBill().calculate();
    }
}