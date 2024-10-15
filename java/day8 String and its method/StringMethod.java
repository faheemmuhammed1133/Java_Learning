
public class StringMethod {
   public static void main(String[] args) {
      // System.out.println("Hello".length());
      
      
      
      System.out.println("  /   " );
      String s1="java";
      char ch[]={'s','t','r','i','n','g','s'};
      String s2=new String(ch);
      String s3=new String("example");
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
      System.out.println("Hello".substring(1));
      System.out.println("Hello".substring(1,3));
      System.out.println("hello".indexOf("hello",1));

      System.out.println(s1.length());
      System.out.println(s2.charAt(2));
      System.out.println(s3.indexOf('e'));
      System.out.println(s3.indexOf('e',4));
      System.out.println("hello".lastIndexOf("hello"));
      System.out.println("hello".contains("o"));
      System.out.println("hello ".concat(s3));
      System.out.println("hello ".equals(s3));
      System.out.println("hello".equalsIgnoreCase("HELLO"));
      System.out.println("hello".compareToIgnoreCase("HELLO"));
      System.out.println(s2.isEmpty());
      System.out.println(s2.toLowerCase());
      System.out.println("hello".compareTo("suii"));



      
      System.out.println("hello".compareTo("held"));
      
      
      System.out.println(" Hello I am here . ".trim());
      System.out.println(" Hello I am here . ".replace("e","a"));
      
      String s4=String.valueOf(37.6);
      System.out.println(s4+10.4);

      System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());


        System.out.println("abc".contains("ab"));
        char ch1[] = s1.toCharArray();
        for (int i=0;i<ch1.length;i++)
        {
            System.out.print(ch1[i]+" ");
        }
        System.out.println();
        System.out.println("Hello".startsWith("he"));
        System.out.println("Hello".endsWith("lo"));



   }   
}
