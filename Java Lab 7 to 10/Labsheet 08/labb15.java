import java.util.*;
class Student<T,U,V>{
 T id; U name; V marks;
 Student(T i,U n,V m){id=i;name=n;marks=m;}
 void display(){System.out.println(id+" "+name+" "+marks);}
}
class Test{
 public static void main(String[] a){
  ArrayList<Student<Integer,String,Double>> l=new ArrayList<>();
  l.add(new Student<>(1,"Aman Singh",85.5));
  l.add(new Student<>(2,"Ravi",90.0));
  l.add(new Student<>(3,"Neha",88.5));
  l.add(new Student<>(4,"Raj",75.0));
  l.add(new Student<>(5,"Priya",92.0));
  for(Student<Integer,String,Double> s:l) s.display();
  System.out.println("First: "+l.get(0).name);
  System.out.println("Total: "+l.size());
  boolean f=false;
  for(Student<Integer,String,Double> s:l)
   if(s.name.equals("Aman Singh")) f=true;
  System.out.println(l.contains(l.get(0)));
  System.out.println(f?"Student Found":"Not Found");
 }
}