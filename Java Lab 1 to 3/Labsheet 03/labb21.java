import java.util.*;
class Main{
public static void main(String[] args){
int[] a={1,2,3,4,5};int t=a[0];
for(int i=0;i<a.length-1;i++)a[i]=a[i+1];
a[a.length-1]=t;
System.out.println(Arrays.toString(a));
}}