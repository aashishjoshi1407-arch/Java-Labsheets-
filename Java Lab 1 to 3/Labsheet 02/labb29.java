class Main{
public static void main(String[]z){
while(true){
int n=(int)(Math.random()*100)+1;
System.out.print(n+" ");
if(n%7==0&&n%13==0)break;
}
}}