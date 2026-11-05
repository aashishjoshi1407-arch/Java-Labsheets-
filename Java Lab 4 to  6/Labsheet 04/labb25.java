class Factorial {
    static int totalCalls;
    void find(int n){
        long f=1;totalCalls++;
        if(n<0||n>20){System.out.println("Invalid input");return;}
        for(int i=1;i<=n;i++)f*=i;
        System.out.println("Factorial: "+f+"\nCalls: "+totalCalls);
    }
}
class Main {
    public static void main(String[] args){
        new Factorial().find(5);
    }
}