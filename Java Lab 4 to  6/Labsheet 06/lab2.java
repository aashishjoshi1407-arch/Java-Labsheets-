import java.util.*;
class Main{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  int[] x={10,20,30,40,50};
  try{System.out.println(x[s.nextInt()]);}
  catch(ArrayIndexOutOfBoundsException e){System.out.println("Invalid index");}
 }
}