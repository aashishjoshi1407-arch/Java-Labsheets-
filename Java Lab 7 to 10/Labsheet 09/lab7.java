import java.util.*;
class Main{
 public static void main(String[] args){
  ArrayList<Integer> a=new ArrayList<>(Arrays.asList(5,2,8,2,9));
  Collections.sort(a);
  System.out.println(a);
  Collections.reverse(a);
  System.out.println(a);
  System.out.println(Collections.max(a));
  System.out.println(Collections.min(a));
  System.out.println(Collections.frequency(a,2));
 }
}