class StringReverse {
    static int totalReversals;
    void reverse(String s){
        String r="";totalReversals++;
        for(int i=s.length()-1;i>=0;i--)r+=s.charAt(i);
        System.out.println(r+"\nReversals: "+totalReversals);
    }
}
class Main {
    public static void main(String[] args){
        new StringReverse().reverse("Java");
    }
}