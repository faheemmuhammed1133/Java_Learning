// import java.util.*;
import java.util.SortedSet;
import java.util.TreeSet;
public class SortedSetEx {
   public static void main(String[] args) {
      SortedSet<String> set = new TreeSet<>(); 
         set.add("PP");
         set.add("DD");
         set.add("AA");
         set.add("XX");
         set.add("CC");
         set.add("BB");

         System.out.println(set);
         System.out.println("first in set "+set.first());
         System.out.println("first in set "+set.last());

         System.out.println(""+set.headSet("DD"));
         System.out.println(""+set.tailSet("CC"));

         System.out.println("subset "+set.subSet("BB", "PP"));

         SortedSet<String> s=set.subSet("BB", "PP");
         s.add("EE");
         System.out.println(s);
         System.out.println(set);

      
   }
}
