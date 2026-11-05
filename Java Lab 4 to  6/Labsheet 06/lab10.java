import java.util.*;
class InvalidMarksException extends Exception{
 InvalidMarksException(){super("Invalid marks");}
}
class Main{
 public static void main(String[] a){
  try{
   int m=new Scanner(System.in).nextInt();
   if(m<0||m>100)throw new InvalidMarksException();
   System.out.println("Valid marks");
  }catch(Exception e){System.out.println(e.getMessage());}
 }
}