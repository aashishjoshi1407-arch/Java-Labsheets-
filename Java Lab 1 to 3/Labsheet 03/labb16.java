class Main{
public static void main(String[] args){
int[][][] a={{{1,-2},{3,-4}},{{-5,6},{7,-8}}};
int p=0,n=0;
for(int[][] x:a)for(int[] y:x)for(int z:y)
if(z>0)p++;else if(z<0)n++;
System.out.println("Positive="+p+" Negative="+n);
}}