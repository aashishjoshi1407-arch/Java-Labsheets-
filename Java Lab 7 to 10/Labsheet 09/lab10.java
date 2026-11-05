import java.util.*;
class Main{
 public static void main(String[] args){
  ArrayList<Integer> a=new ArrayList<>(Arrays.asList(3,1,2,3,1));
  HashSet<Integer> s=new HashSet<>(a);
  System.out.println("List: "+a);
  System.out.println("Set: "+s);
 }
}