class Main{
public static void main(String[]z){
char c='a';
System.out.println("aeiouAEIOU".indexOf(c)>=0?"Vowel":Character.isLetter(c)?"Consonant":c>='0'&&c<='9'?"Digit":"Special");
}}