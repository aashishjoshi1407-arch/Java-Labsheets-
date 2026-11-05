class Main{
public static void main(String[] args){
int[][][] a={{{1,2},{3,4}},{{5,6},{7,8}}};
int key=6;
for(int i=0;i<2;i++)
for(int j=0;j<2;j++)
for(int k=0;k<2;k++)
if(a[i][j][k]==key)System.out.println(i+" "+j+" "+k);
}}