import java.util.*;
class InsufficientBalanceException extends Exception{
 InsufficientBalanceException(){super("Insufficient balance");}
}
class Main{
 public static void main(String[] a){
  try{
   Scanner s=new Scanner(System.in);
   int b=Integer.parseInt(s.nextLine()),w=Integer.parseInt(s.nextLine());
   if(w<0)throw new Exception("Negative amount");
   if(w>b)throw new InsufficientBalanceException();
   System.out.println("Remaining balance: "+(b-w));
  }catch(InsufficientBalanceException e){System.out.println(e.getMessage());}
   catch(NumberFormatException e){System.out.println("Invalid input");}
   catch(Exception e){System.out.println(e.getMessage());}
   finally{System.out.println("Bank transaction completed.");}
 }
}