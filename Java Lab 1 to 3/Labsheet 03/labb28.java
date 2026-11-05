class Main{
public static void main(String[] args){
int[][] a={{1,2,3},{4,5,6}};
int key=5;boolean found=false;
for(int i=0;i<a.length;i++)
for(int j=0;j<a[i].length;j++)
if(a[i][j]==key){
System.out.println("Row="+i+" Column="+j);
found=true;
}
if(!found)System.out.println("Not found");
}}