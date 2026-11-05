class Library {
    int booksAvailable=10;
    static String libraryName="City Library";
    void issue(int n){
        int x=n;
        if(x>0&&x<=booksAvailable)booksAvailable-=x;
        else System.out.println("Cannot issue");
    }
    void returns(int n){
        int x=n;
        if(x>0)booksAvailable+=x;
    }
}
class Main {
    public static void main(String[] args){
        Library l=new Library();
        l.issue(2);l.returns(1);
        System.out.println(Library.libraryName+" Books: "+l.booksAvailable);
    }
}