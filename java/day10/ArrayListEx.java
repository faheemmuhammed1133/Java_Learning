import java.util.*;
public class ArrayListEx {
      public static void main(String[] args) {
         ArrayList<String> list1 =new ArrayList<String>();

         list1.add("Tom");
         list1.add("shyam");
         list1.add("ravi");
         list1.add("pam");
         list1.add("Sam");
         list1.add("Ram");
         System.out.println(" ** ADD elements in list1 usind add( index, element) **");
         list1.add(1,"Naina");

         // errror list1.add(1)  as only strings allowed

         System.out.println(" print elements in the list way we added ");
         System.out.println("List1 : "+list1);
         
         
         System.out.println(" updating ");
         list1.set(2, "shanoy");
         System.out.println("Updated List1 : "+list1);

         System.out.println(" removing ");
         list1.remove( 2);
         System.out.println("Updated after removing List1 : "+list1);

         list1.remove( "Ram");
         System.out.println("Updated after removing List1 : "+list1);
         
         System.out.println("claer list ");     
         list1.clear();
         System.out.println("Updated after clearing List1 : "+list1);


      }
}
