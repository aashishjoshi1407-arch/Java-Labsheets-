import java.util.*;
class InvalidPatientAgeException extends Exception{
 InvalidPatientAgeException(){super("Invalid age");}
}
class Main{
 public static void main(String[] a){
  Scanner s=new Scanner(System.in);
  try{
   String n=s.nextLine();
   int age=Integer.parseInt(s.nextLine());
   if(age<0||age>120)throw new InvalidPatientAgeException();
   System.out.println("Registered: "+n);
  }catch(InvalidPatientAgeException|NumberFormatException e){
   System.out.println(e.getMessage());
  }
 }
}