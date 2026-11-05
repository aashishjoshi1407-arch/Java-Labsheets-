class Main{
public static void main(String[]z){
String a="Apple",b="Banana";int i=0;
while(i<a.length()&&i<b.length()&&a.charAt(i)==b.charAt(i))i++;
System.out.println(i==a.length()&&i==b.length()?"Equal":i==a.length()?"First smaller":i==b.length()?"Second smaller":a.charAt(i)<b.charAt(i)?"First smaller":"Second smaller");
}}