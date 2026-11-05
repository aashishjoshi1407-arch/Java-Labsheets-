class Main{
public static void main(String[] args){
int[][] a={{1,2},{3,4}};int s=0;
for(int[] r:a)for(int x:r)s+=x;
System.out.println(s);
}}