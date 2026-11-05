class Temperature {
    double celsius=25;
    static String scale="Celsius";
    void convert(){
        double f=celsius*9/5+32,k=celsius+273.15;
        System.out.println(scale+": "+celsius+"\nF: "+f+"\nK: "+k);
    }
}
class Main {
    public static void main(String[] args){
        new Temperature().convert();
    }
}