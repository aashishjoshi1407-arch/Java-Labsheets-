class Main{
public static void main(String[]z){
int[][] a={{80,70},{60,90}};int s=0,c=0;
for(int[] r:a)for(int n:r){s+=n;c++;}
System.out.println((double)s/c);
}}