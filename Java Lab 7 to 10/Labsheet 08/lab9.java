import java.util.*;
class Test{
 public static void main(String[] a){
  ArrayList<Integer> l=new ArrayList<>();
  for(int i=1;i<=10;i++) l.add(i);
  for(int n:l) System.out.println(n);
 }
}