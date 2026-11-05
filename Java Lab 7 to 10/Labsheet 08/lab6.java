class Employee<T,U>{
 T id; U name;
 Employee(T i,U n){id=i;name=n;}
 void display(){System.out.println(id+" "+name);}
 public static void main(String[] a){
  new Employee<Integer,String>(101,"Aman Singh").display();
 }
}