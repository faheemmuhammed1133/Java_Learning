import java.util.*;

public class CollectiorSortEx1 {
   public static void main(String[] args) {
      ArrayList<String> list1=new ArrayList<String>();
      list1.add("TT");
      list1.add("SS");
      list1.add("RR");
      list1.add("BB");
      list1.add("AA");
      list1.add("CC");

      System.out.println(list1);
      
      Collections.sort(list1);
      System.out.println( " list after sort "+list1);

      Collections.sort(list1,Collections.reverseOrder());
      System.out.println( " list after reverse sort "+list1);

      System.out.println(Collections.binarySearch(list1, "TT"));

   }
}
