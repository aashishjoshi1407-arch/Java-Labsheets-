class WordCounter {
    static String language="English";
    void count(String s){
        int n=s.trim().isEmpty()?0:s.trim().split("\\s+").length;
        System.out.println(language+" Words: "+n);
    }
}
class Main {
    public static void main(String[] args){
        new WordCounter().count("Java is easy");
    }
}