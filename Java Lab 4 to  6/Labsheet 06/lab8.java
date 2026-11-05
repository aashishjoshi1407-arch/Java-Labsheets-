class Main{
 public static void main(String[] a){
  try{
   try{int[] x={1,2};System.out.println(x[5]);}
   catch(ArrayIndexOutOfBoundsException e){System.out.println("Invalid index");}
   System.out.println(10/0);
  }catch(ArithmeticException e){System.out.println("Division error");}
 }
}