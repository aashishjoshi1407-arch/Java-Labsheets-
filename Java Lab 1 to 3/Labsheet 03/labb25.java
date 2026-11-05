class Main{
public static void main(String[] args){
int[][] a={{1,2,3},{4,5,6},{7,8,9}};
int x=0,y=0,n=a.length;
for(int i=0;i<n;i++){
x+=a[i][i];y+=a[i][n-1-i];
}
System.out.println("Main="+x+" Secondary="+y);
}}