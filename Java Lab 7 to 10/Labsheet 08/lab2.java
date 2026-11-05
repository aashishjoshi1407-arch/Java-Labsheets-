class Result<T>{
 T m;
 Result(T m){this.m=m;}
 public static void main(String[] a){
  System.out.println(new Result<Integer>(85).m);
  System.out.println(new Result<Double>(92.5).m);
 }
}