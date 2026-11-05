import java.util.*;
class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int[] a=new int[10];
for(int i=0;i<10;i++)a[i]=s.nextInt();
for(int i=9;i>=0;i--)System.out.print(a[i]+" ");
}}