import java.util.*;
public class TreeSetEx {
   public static void main(String[] args) {
      NavigableSet<String> ts=new TreeSet<>();
      ts.add("AA");
      ts.add("BB");
      ts.add("CC");
      ts.add("FF");
      System.out.println(ts);

      TreeSet<String> s=(TreeSet<String>)ts.headSet("II");
      System.out.println("S "+s);
      System.out.println("S "+s.add("GG"));
      System.out.println("S "+s);
      System.out.println("TS "+ts);

      System.out.println("Tailset and add");
      System.out.println(ts.tailSet("CC").add("EE"));
      System.out.println(ts.tailSet("CC").add("CC"));
      
      System.out.println("TS "+ts);
      System.out.println("S "+s);
      
      System.out.println(ts.subSet("CC","FF"));
      System.out.println(ts.first());
      System.out.println(ts.last());

      System.out.println("ts.floor(\"BB\")   "+ts.floor("BB"));
      System.out.println("ts.ceiling(\"DD\") "+ts.ceiling("DD"));
      System.out.println("ts.ceiling(\"EE\") "+ts.ceiling("EE"));
      System.out.println("ts.ceiling(\"II\") "+ts.ceiling("II"));

      System.out.println("higher "+ts.higher("CC"));
      System.out.println("higher "+ts.higher("GG"));
      System.out.println("higher "+ts.lower("CC"));
      System.out.println("higher "+ts.pollFirst());
      System.out.println("higher "+ts.pollLast());

      System.out.println("ts after pollFirst  and pollLast"+ts);
      System.out.println("s after pollFirst  and pollLast"+s);

      TreeSet<String> sh=(TreeSet<String>)ts.descendingSet();
      System.out.println(sh);
      System.out.println(sh.add("ZZ"));
      System.out.println(sh);

      System.out.println("headSet(BB,true) "+ts.headSet("BB",true));
      System.out.println("headSet(BB,true) "+ts.headSet("BB",false));
      System.out.println("headSet(BB,true) "+ts.tailSet("BB",true));
      System.out.println("headSet(BB,true) "+ts.tailSet("BB",false));

      System.out.println("subSet(BB, false, FF, false): " + ts.subSet("BB", false, "FF", false));
        System.out.println("subSet(BB, false, FF, true): " + ts.subSet("BB", false, "FF", true));
        System.out.println("subSet(BB, true, FF, true): " + ts.subSet("BB", true, "FF", true));

        System.out.println("Descending Iterator:");
        Iterator<String> desItr = ts.descendingIterator();
        while (desItr.hasNext()) {
            System.out.println(desItr.next());
        }

        System.out.println("Iterator:");
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        List<Integer> list = List.of(44, 22, 11, 33, 22);
        System.out.println("List: " + list);
        TreeSet<Integer> ts1 = new TreeSet<>(list);
        System.out.println("TreeSet from list: " + ts1);

        HashSet<Double> hs = new HashSet<>();
        hs.add(55.9);
        hs.add(54.4);
        hs.add(55.7);
        hs.add(35.7);
        hs.add(51.4);
        Set<Double> s1 = new TreeSet<>(hs);
        System.out.println("Created TreeSet from HashSet: " + s1);

        LinkedList<Double> ll = new LinkedList<>(hs);
        ll.add(55.9);
        System.out.println("Created LinkedList from HashSet: " + ll);

        TreeSet<Double> sb = new TreeSet<>(ll);
        System.out.println("Created TreeSet from LinkedList: " + sb);

        Set<Integer> set2 = Set.of(77, 44, 33, 22);
        System.out.println("Set.of: " + set2);

        Set<Double> sof1 = Set.copyOf(ll);
        System.out.println("Set.copyOf: " + sof1);
   }
}
