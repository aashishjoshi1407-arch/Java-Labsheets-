class Main{
public static void main(String[] args){
int[][] a={{1,2,3},{4,5,6}};
for(int j=0;j<3;j++){
int s=0;for(int i=0;i<2;i++)s+=a[i][j];
System.out.println(s);
}
}}