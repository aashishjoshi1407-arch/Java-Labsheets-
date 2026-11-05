class Product<T,U>{
 T id; U price;
 Product(T i,U p){id=i;price=p;}
 public static void main(String[] a){
  Product<Integer,Double> p1=new Product<>(1,99.5);
  Product<Integer,Double> p2=new Product<>(2,150.0);
  Product<Integer,Double> p3=new Product<>(3,75.5);
  System.out.println(p1.id+" "+p1.price);
  System.out.println(p2.id+" "+p2.price);
  System.out.println(p3.id+" "+p3.price);
 }
}