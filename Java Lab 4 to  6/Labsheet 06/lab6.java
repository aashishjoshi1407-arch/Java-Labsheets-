import java.util.*;
class Main{
 public static void main(String[] a){
  int m=new Scanner(System.in).nextInt();
  try{
   if(m<0||m>100) throw new Exception("Invalid marks");
   System.out.println("Valid marks");
  }catch(Exception e){System.out.println(e.getMessage());}
 }
}