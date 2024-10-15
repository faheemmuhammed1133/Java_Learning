public class StringBuilderEx1 {
 public static void main(String[] args) {
   StringBuilder sb1=new StringBuilder("Hello World");
   System.out.println(sb1);
   StringBuilder reverseSb=sb1.reverse();
   System.out.println("reversed string -> "+reverseSb);
   System.out.println("Modified StringBuilder -> "+sb1);

   StringBuilder sb2=new StringBuilder();
   System.out.println("capacity of StringBuilder =" +sb2.capacity());
   
   sb2.append("Hello");
   sb2.append("Hello");
   sb2.append("Hello");
   sb2.append("Hello");
   System.out.println("mpdified sb2 = "+sb2);
   System.out.println("capacity of StringBuilder =" +sb2.capacity());

   sb2.insert(6,"beautiful" );
   System.out.println(sb2.toString());

   StringBuilder sb3=new StringBuilder("Hello");
   sb3.replace(1,3, "sui");
   System.out.println("after replace "+sb3);
   
   StringBuilder sb4=new StringBuilder("hello");
   sb4.delete(1, 3);
   System.out.println("after deletion "+sb4);


}  
}
