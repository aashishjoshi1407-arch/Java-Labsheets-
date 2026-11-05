class Palindrome {
    static int countChecks;
    void check(int n){
        int x=n,r=0;countChecks++;
        while(x>0){r=r*10+x%10;x/=10;}
        System.out.println(n>=0&&n==r?"Palindrome":"Not Palindrome");
    }
}
class Main {
    public static void main(String[] args){
        new Palindrome().check(121);
        System.out.println("Checks: "+Palindrome.countChecks);
    }
}