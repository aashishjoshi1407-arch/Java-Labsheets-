class Main{
public static void main(String[] args){
int[][] a={{0,0,1},{0,2,0},{0,0,3}};
int z=0,n=0;
for(int[] r:a)for(int x:r)
if(x==0)z++;else n++;
System.out.println(z>n?"Sparse Matrix":"Not Sparse");
}}