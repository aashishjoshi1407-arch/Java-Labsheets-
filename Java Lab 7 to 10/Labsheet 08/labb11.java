import java.util.*;
class Test{
 public static void main(String[] a){
  ArrayList<Integer> l=new ArrayList<>();
  for(int i=1;i<=10;i++) l.add(i);
  Scanner s=new Scanner(System.in);
  System.out.print("Enter number: ");
  System.out.println(l.contains(s.nextInt())?"Found":"Not Found");
 }
}