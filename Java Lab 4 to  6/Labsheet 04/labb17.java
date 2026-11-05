class Main{
public static void main(String[] args){
int[][][] a={{{1,9},{3,4}},{{5,6},{7,8}}};
int m=Integer.MIN_VALUE;
for(int[][] x:a)for(int[] y:x)for(int z:y)m=Math.max(m,z);
System.out.println(m);
}}