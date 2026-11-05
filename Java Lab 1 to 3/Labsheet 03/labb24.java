class Main{
public static void main(String[] args){
int[] a={1,2,2,3,1,4};
for(int i=0;i<a.length;i++){
boolean b=false;
for(int j=0;j<i;j++)if(a[i]==a[j])b=true;
if(!b)System.out.print(a[i]+" ");
}
}}