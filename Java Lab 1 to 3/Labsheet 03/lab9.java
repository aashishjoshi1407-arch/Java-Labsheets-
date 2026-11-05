class Main{
public static void main(String[] args){
int[][] a={{1,2,3},{4,5,6}};
for(int[] r:a){
int s=0;for(int x:r)s+=x;
System.out.println(s);
}
}}