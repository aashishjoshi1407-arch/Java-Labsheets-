import java.util.*;
class InvalidDosageException extends Exception{
 InvalidDosageException(){super("Invalid dosage");}
}
class Main{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  try{
   String p=s.nextLine(),d=s.nextLine();
   int m=Integer.parseInt(s.nextLine());
   if(m<1||m>1000)throw new InvalidDosageException();
   System.out.println("Valid dosage: "+p+" "+d);
  }catch(InvalidDosageException|NumberFormatException e){
   System.out.println(e.getMessage());
  }finally{System.out.println("Dosage validation completed.");}
 }
}