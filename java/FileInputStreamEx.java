import java.io.*;
public class FileInputStreamEx {
   public static void main(String[] args) {
      FileInputStream fin =null;

      try {
         fin = new FileInputStream("day16/fil1.txt");
         int b;
         while ((b=fin.read())!=-1) {
            System.out.print((char)b);
         }
      }catch(FileNotFoundException e){
         System.out.println("File not found "+ e );
      }catch(IOException e ){
         System.out.println("IOexception "+e);
      }finally{
         try {
            if (fin != null) {
               fin.close();
            }
         } catch (Exception e) {
            System.out.println(" error closing file  "+e);
         }
      }
   }
}
