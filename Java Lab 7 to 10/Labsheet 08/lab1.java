class Box<T>{
 T v;
 Box(T v){this.v=v;}
 public static void main(String[] a){
  System.out.println(new Box<Integer>(10).v);
  System.out.println(new Box<String>("Aman Singh").v);
  System.out.println(new Box<Double>(5.5).v);
 }
}