import java.util.*;
class Main{
 public static void main(String[] args){
  ArrayList<String> a=new ArrayList<>(Arrays.asList("Java","Python","C","C++","HTML"));
  ListIterator<String> i=a.listIterator();
  while(i.hasNext()) System.out.print(i.next()+" ");
  System.out.println("\nNextIndex: "+i.nextIndex());
  while(i.hasPrevious()) System.out.print(i.previous()+" ");
  System.out.println("\nPreviousIndex: "+i.previousIndex());
 }
}