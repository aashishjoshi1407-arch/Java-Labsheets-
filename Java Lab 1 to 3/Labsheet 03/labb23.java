class Main{
public static void main(String[] args){
int[] a={5,8,2,9,7};
Integer m=null,s=null;
for(int x:a){
if(m==null||x>m){s=m;m=x;}
else if(x<m&&(s==null||x>s))s=x;
}
System.out.println(s==null?"Not found":s);
}}