import java.util.*;
class InvalidQuantityException extends Exception{
 InvalidQuantityException(){super("Negative quantity");}
}
class InsufficientMedicineStockException extends Exception{
 InsufficientMedicineStockException(){super("Insufficient stock");}
}
class Main{
 public static void main(String[] a){
  try{
   Scanner s=new Scanner(System.in);
   String n=s.nextLine();
   int x=Integer.parseInt(s.nextLine()),y=Integer.parseInt(s.nextLine());
   if(x<0||y<0)throw new InvalidQuantityException();
   if(y>x)throw new InsufficientMedicineStockException();
   System.out.println("Stock available: "+n);
  }catch(InvalidQuantityException e){System.out.println(e.getMessage());}
   catch(InsufficientMedicineStockException e){System.out.println(e.getMessage());}
   catch(NumberFormatException e){System.out.println("Invalid input");}
   finally{System.out.println("Inventory transaction completed.");}
 }
}