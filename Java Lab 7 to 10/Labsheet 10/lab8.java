import java.io.*;
class Main{
 public static void main(String[] args)throws Exception{
  FileReader f=new FileReader("input.txt");
  int v=0,c=0,d=0,s=0,x;
  while((x=f.read())!=-1){
   char a=Character.toLowerCase((char)x);
   if("aeiou".indexOf(a)>=0)v++;
   else if(a>='a'&&a<='z')c++;
   else if(Character.isDigit(a))d++;
   else if(a==' ')s++;
  }
  f.close();
  System.out.println("Vowels: "+v+"\nConsonants: "+c+"\nDigits: "+d+"\nSpaces: "+s);
 }
}