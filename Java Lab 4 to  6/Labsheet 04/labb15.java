class SimpleInterest {
    double principal=10000,rate=5,time=2;
    static String bank="SBI";
    void calculate(){
        double si=principal*rate*time/100;
        System.out.println(bank+" Interest: "+si);
    }
}
class Main {
    public static void main(String[] args){
        new SimpleInterest().calculate();
    }
}