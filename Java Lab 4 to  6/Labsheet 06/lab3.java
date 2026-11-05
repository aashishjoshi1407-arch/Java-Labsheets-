class Main{
 public static void main(String[] a){
  try{System.out.println(Integer.parseInt("abc"));}
  catch(NumberFormatException e){System.out.println("Invalid number");}
 }
}