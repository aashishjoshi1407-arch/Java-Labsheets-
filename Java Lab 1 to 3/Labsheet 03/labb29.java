import java.util.*;
class Main{
public static void main(String[] args){
int[][] a={{3,1},{9,5,2},{8,4,6,7}};
for(int[] r:a){
Arrays.sort(r);
System.out.println(Arrays.toString(r));
}
}}