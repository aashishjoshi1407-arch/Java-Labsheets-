class Main{
public static void main(String[] args){
int[][] a={{1,2,3},{4,5,6},{7,8,9}};
for(int k=0;k<2;k++){
System.out.println(k==0?"Upper:":"Lower:");
for(int i=0;i<3;i++){
for(int j=0;j<3;j++)
System.out.print((k==0?i<=j:i>=j)?a[i][j]+" ":"0 ");
System.out.println();
}
}
}}