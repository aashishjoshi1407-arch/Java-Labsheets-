class Pair<T,U>{
 T id; U name;
 Pair(T i,U n){id=i;name=n;}
 public static void main(String[] a){
  Pair<Integer,String> p=new Pair<>(101,"Aman Singh");
  System.out.println(p.id+" "+p.name);
 }
}