import java.util.*;
class Main{
 public static void main(String[] args){
  List<String> a=new ArrayList<>(Arrays.asList("Java","Python","C"));
  ListIterator<String> i=a.listIterator();
  while(i.hasNext()){
   String s=i.next();
   if(s.equals("Python")) i.set("C++");
   if(s.equals("C")) i.add("HTML");
  }
  System.out.println(a);
 }
}