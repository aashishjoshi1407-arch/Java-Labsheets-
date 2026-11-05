class Container<T>{
 T v;
 void add(T x){v=x;}
 T get(){return v;}
 public static void main(String[] a){
  Container<Integer> c1=new Container<>();
  Container<String> c2=new Container<>();
  Container<Double> c3=new Container<>();
  c1.add(10); c2.add("Aman Singh"); c3.add(5.5);
  System.out.println(c1.get());
  System.out.println(c2.get());
  System.out.println(c3.get());
 }
}