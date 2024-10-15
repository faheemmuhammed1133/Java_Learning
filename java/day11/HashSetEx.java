import java.util.*;
public class HashSetEx {
 public static void main(String[] args) {
   HashSet<String> h = new HashSet<String>();

   h.add("AA");
   h.add("DD");
   h.add("BB");
   h.add("CC");

   System.out.println(h.add("AA")); // return false as set cannot have identical values
   System.out.println(h);
   
   System.out.println("is list contains DD or not ? "+h.contains("DD"));
   h.remove("BB");
   System.out.println("After removing BB "+ h);
   System.out.println("iterating over list ");

   Iterator<String> it= h.iterator();
   while (it.hasNext()) {
      System.out.println("-> "+it.next());
   }
   System.out.println();
   
   System.out.println("Using enhanced for loop : ");
   for (String el : h){
      System.out.print(el+" , ");
   }
 }  
}
