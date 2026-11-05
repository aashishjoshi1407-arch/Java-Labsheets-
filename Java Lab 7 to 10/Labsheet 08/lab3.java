class Student<T>{
 T id;
 Student(T id){this.id=id;}
 public static void main(String[] a){
  System.out.println(new Student<Integer>(101).id);
 }
}