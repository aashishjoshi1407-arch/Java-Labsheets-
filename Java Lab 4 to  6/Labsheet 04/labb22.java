class Armstrong {
    static int totalChecks;
    void check(int n){
        int x=n,s=0,d=String.valueOf(n).length();totalChecks++;
        while(x>0){s+=(int)Math.pow(x%10,d);x/=10;}
        System.out.println(n>=0&&s==n?"Armstrong":"Not Armstrong");
    }
}
class Main {
    public static void main(String[] args){
        new Armstrong().check(153);
        System.out.println("Checks: "+Armstrong.totalChecks);
    }
}