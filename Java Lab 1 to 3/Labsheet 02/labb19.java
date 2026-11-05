class Main{
public static void main(String[]z){
for(int n=1;n<=1000;n++){
int s=0,d=(""+n).length();
for(int x=n;x>0;x/=10)s+=(int)Math.pow(x%10,d);
if(s==n)System.out.print(n+" ");
}
}}