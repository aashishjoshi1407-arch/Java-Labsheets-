class Main{
public static void main(String[] args){
int[] a={1,2,2,3,1};
for(int i=0;i<a.length;i++){
int c=0;boolean seen=false;
for(int j=0;j<i;j++)if(a[i]==a[j])seen=true;
if(seen)continue;
for(int x:a)if(x==a[i])c++;
System.out.println(a[i]+"="+c);
}
}}