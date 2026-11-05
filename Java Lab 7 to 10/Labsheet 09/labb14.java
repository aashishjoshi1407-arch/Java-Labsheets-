import java.util.*;
class Main{
 public static void main(String[] args){
  ArrayList<Integer> a=new ArrayList<>(Arrays.asList(10,20,30));
  LinkedList<Integer> b=new LinkedList<>(a);
  a.add(1,15); b.add(1,15);
  a.remove(2); b.remove(2);
  System.out.println(a);
  System.out.println(b);
  System.out.println(a.get(1));
  System.out.println(b.size());
  for(int x:a) System.out.print(x+" ");
  System.out.println();
  for(int x:b) System.out.print(x+" ");
 }
}