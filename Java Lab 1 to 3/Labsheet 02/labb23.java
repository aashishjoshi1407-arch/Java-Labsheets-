class Main{
public static void main(String[]z){
int n=121,x=n,r=0;
while(x>0){r=r*10+x%10;x/=10;}
System.out.println(n==r?"Palindrome":"Not Palindrome");
}}