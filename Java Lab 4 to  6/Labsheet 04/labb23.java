class PrimeChecker {
    static int totalPrimeChecks;
    void check(int n){
        boolean p=n>1;totalPrimeChecks++;
        for(int i=2;i<=n/i;i++)if(n%i==0){p=false;break;}
        System.out.println(p?"Prime":"Not Prime");
    }
}
class Main {
    public static void main(String[] args){
        new PrimeChecker().check(7);
        System.out.println("Checks: "+PrimeChecker.totalPrimeChecks);
    }
}