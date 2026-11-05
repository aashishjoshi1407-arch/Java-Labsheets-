class Main{
public static void main(String[] args){
int[][][] a={{{1,2},{3,4}},{{5,6},{7,8}}};
int s=0;
for(int[][] x:a)for(int[] y:x)for(int z:y)s+=z;
System.out.println(s);
}}