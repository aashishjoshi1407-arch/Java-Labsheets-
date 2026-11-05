import java.util.*;
class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int[][][] a=new int[2][2][2];
for(int[][] x:a)for(int[] y:x)
for(int i=0;i<2;i++)y[i]=s.nextInt();
System.out.println(Arrays.deepToString(a));
}}