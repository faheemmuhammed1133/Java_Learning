public class TypeConversion {
   public static void main(String[] args) {
       int num = 100;
       double decimal = num; 
       System.out.println("Implicit Type Conversion:");
       System.out.println("Integer value: " + num);
       System.out.println("Converted to double: " + decimal);

       double largeDecimal = 99.99;
       int truncatedNum = (int) largeDecimal;
       System.out.println("\nExplicit Type Conversion:");
       System.out.println("Double value: " + largeDecimal);
       System.out.println("Converted to int (truncated): " + truncatedNum);
   }
}
