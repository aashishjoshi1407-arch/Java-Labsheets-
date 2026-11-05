class Main{
public static void main(String[]z){
int[] a={4,8,2,9,1};int min=a[0],max=a[0];
for(int n:a){if(n<min)min=n;if(n>max)max=n;}
System.out.println("Max="+max+" Min="+min);
}}