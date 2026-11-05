import java.util.*;
class Main{
 public static void main(String[] args){
  ArrayList<String> students=new ArrayList<>();
  HashSet<Integer> ids=new HashSet<>();
  TreeSet<Integer> sorted=new TreeSet<>();
  Scanner sc=new Scanner(System.in);
  while(true){
   System.out.println("\n1.Add 2.Remove 3.Search 4.Display 5.Count 6.Iterate 7.Exit");
   int ch=sc.nextInt();
   if(ch==7) break;
   switch(ch){
    case 1:
     System.out.print("ID and Name: ");
     int id=sc.nextInt();
     String name=sc.next();
     if(ids.add(id)){
      sorted.add(id);
      students.add(id+"-"+name);
     }
     break;
    case 2:
     System.out.print("Enter ID: ");
     id=sc.nextInt();
     if(ids.remove(id)){
      sorted.remove(id);
      students.removeIf(s->s.startsWith(id+"-"));
     }
     break;
    case 3:
     System.out.print("Enter ID: ");
     id=sc.nextInt();
     for(String s:students)
      if(s.startsWith(id+"-")) System.out.println(s);
     break;
    case 4:
     System.out.println(students);
     System.out.println(ids);
     System.out.println(sorted);
     break;
    case 5:
     System.out.println("Total: "+students.size());
     break;
    case 6:
     ListIterator<String> i=students.listIterator();
     while(i.hasNext()) System.out.println(i.next());
     while(i.hasPrevious()) System.out.println(i.previous());
     break;
   }
  }
 }
}