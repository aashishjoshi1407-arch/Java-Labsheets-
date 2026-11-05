import java.util.*;
class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int[][] a=new int[3][3];
for(int i=0;i<3;i++)
for(int j=0;j<3;j++)a[i][j]=s.nextInt();
for(int[] r:a)System.out.println(Arrays.toString(r));
}}