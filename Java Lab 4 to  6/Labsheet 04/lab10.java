class Movie {
    String name="RRR",genre="Action";
    double rating=8.5;
    static String industry="Tollywood";
    void show(){
        String n=name,g=genre; double r=rating;
        System.out.println(n+" "+g+" "+r+" "+industry);
    }
}
class Main {
    public static void main(String[] args){
        new Movie().show();
    }
}