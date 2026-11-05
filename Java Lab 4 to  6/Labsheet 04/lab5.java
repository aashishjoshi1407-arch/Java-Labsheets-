class Book {
    String title,author; double price;
    static String publisher="ABC";
    void show(){
        String t="Java",a="James";
        double p=500;
        title=t;author=a;price=p;
        System.out.println(title+" "+author+" "+price+" "+publisher);
    }
}
class Main {
    public static void main(String[] args){
        new Book().show();
    }
}