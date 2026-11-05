import java.io.*;
class Main{
 public static void main(String[] args)throws Exception{
  BufferedReader b=new BufferedReader(new FileReader("data.txt"));
  String s;int l=0,w=0,c=0;
  while((s=b.readLine())!=null){
   l++;c+=s.length();
   if(!s.trim().isEmpty())w+=s.trim().split("\\s+").length;
  }
  b.close();
  System.out.println("Lines: "+l+"\nWords: "+w+"\nCharacters: "+c);
 }
}