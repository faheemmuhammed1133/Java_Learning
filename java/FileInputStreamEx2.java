// by try with resources
import java.io.*;

public class FileInputStreamEx2 {
   public static void main(String[] args) {
      try(FileInputStream fin =new FileInputStream("day16/fil1.txt")){
      int b;
      while((b=fin.read())!=-1){
         System.out.print((char)b);
      }
      }catch(FileNotFoundException e){
         System.out.println("file not found "+e);
      }catch(IOException e){
         System.out.println("ioexception "+e);
      }
   }
}
