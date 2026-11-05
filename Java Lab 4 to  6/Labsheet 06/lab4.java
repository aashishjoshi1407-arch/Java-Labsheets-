import java.util.*;
class Main{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  try{
   int x=Integer.parseInt(s.nextLine()),y=Integer.parseInt(s.nextLine());
   System.out.println(x/y);
   int[] b={1,2,3,4,5};
   System.out.println(b[Integer.parseInt(s.nextLine())]);
  }
  catch(ArithmeticException e){System.out.println("Division error");}
  catch(ArrayIndexOutOfBoundsException e){System.out.println("Invalid index");}
  catch(NumberFormatException e){System.out.println("Invalid number");}
 }
}