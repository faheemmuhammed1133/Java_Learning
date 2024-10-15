import java.io.*;
public class FileMarkResetSkip {
   public static void main(String[] args) throws IOException {
      try (BufferedReader is =new BufferedReader(new FileReader("txtMark.txt"));) {
         System.out.println((char)is.read());
         System.out.println("if mark supported "+is.markSupported());
         if (is.markSupported()) {
            is.mark(12);
            System.out.println((char)is.read());
            System.out.println((char)is.read());
            is.reset();
            
            System.out.println((char)is.read());
            System.out.println((char)is.read());
            System.out.println((char)is.read());
            System.out.println((char)is.read());
            System.out.println((char)is.read());
            System.out.println((char)is.read());
            is.skip(3);
            System.out.println((char)is.read());
            System.out.println((char)is.read());
            System.out.println((char)is.read());
            System.out.println((char)is.read());
            System.out.println(" -> "+(char)is.read());
            // System.out.println((char)is.read());
            System.out.println(is.reset());
            System.out.println(" -> "+(char)is.read());
            System.out.println((char)is.read());
         }
      } catch (Exception e) {
         
      }
   }
}
