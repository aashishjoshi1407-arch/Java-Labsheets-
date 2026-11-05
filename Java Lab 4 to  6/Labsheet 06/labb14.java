import java.util.*;
class InvalidExamMarksException extends Exception{
 InvalidExamMarksException(){super("Invalid marks");}
}
class Main{
 public static void main(String[] a){
  try{
   int m=Integer.parseInt(new Scanner(System.in).nextLine());
   if(m<0||m>100)throw new InvalidExamMarksException();
   System.out.println(m>=40?"PASS":"FAIL");
  }catch(InvalidExamMarksException|NumberFormatException e){
   System.out.println(e.getMessage());
  }finally{System.out.println("Exam evaluation completed.");}
 }
}