class Main{
public static void main(String[]z){
int n=16,x=n;
while(x>1&&x%4==0)x>>=2;
System.out.println("Power of 4: "+(x==1));
System.out.println("Toggle: "+(n^(1<<2)));
for(int i=1;i<=10;i++){
int p=n*i;
if(p%48==0)break;
if(p%6==0)continue;
System.out.println(p);
}
}}