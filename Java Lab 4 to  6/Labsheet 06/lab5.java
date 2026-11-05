import java.util.*;
class Main{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  try{System.out.println(s.nextInt()/s.nextInt());}
  catch(ArithmeticException e){System.out.println("Division error");}
  finally{System.out.println("Program execution completed.");}
 }
}