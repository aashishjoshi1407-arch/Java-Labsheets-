class Fibonacci {
    static int seriesCount;
    void show(int n){
        int a=0,b=1;seriesCount++;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int c=a+b;a=b;b=c;
        }
        System.out.println("\nSeries: "+seriesCount);
    }
}
class Main {
    public static void main(String[] args){
        new Fibonacci().show(7);
    }
}