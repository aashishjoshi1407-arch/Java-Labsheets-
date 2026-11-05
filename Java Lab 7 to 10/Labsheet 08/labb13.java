class Student<T,U,V>{
 T id; U name; V marks;
 Student(T i,U n,V m){id=i;name=n;marks=m;}
 void display(){System.out.println(id+" "+name+" "+marks);}
 public static void main(String[] a){
  Student<Integer,String,Double> s1=new Student<>(1,"Aman Singh",85.5);
  Student<Integer,String,Double> s2=new Student<>(2,"Ravi",90.0);
  Student<Integer,String,Double> s3=new Student<>(3,"Neha",88.5);
  s1.display(); s2.display(); s3.display();
 }
}