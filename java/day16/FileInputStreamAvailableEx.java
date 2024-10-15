import java.io.*;
public class FileInputStreamAvailableEx {
   public static void main(String[] args) {
      try (FileInputStream input=new FileInputStream("filecheck.txt")) {
         System.out.println("Available bytes at the beginning :"+input.available());
         input.read();
         input.read();
         input.read();
         input.read();
         input.read();
         input.read();
         input.read();
         input.read();
         input.read();

         System.out.println("available bytes at the end "+input.available());
      } catch (FileNotFoundException e) {
         System.out.println("file not found"+e);
      
      } catch (IOException e) {
         System.out.println("read error "+e);
      }
   }
}
