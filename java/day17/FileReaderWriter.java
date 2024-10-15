import java.io.*;
public class FileReaderWriter {
   public static void main(String[] args) {
      try (FileInputStream fin= new FileInputStream("/Users/muhammedfaheem/Desktop/java/day17/file1.txt"); 
         FileOutputStream fout= new FileOutputStream("/Users/muhammedfaheem/Desktop/java/day17/file1New.txt");){

         int b;
         while ((b=fin.read())!=-1) {
            fout.write(b);
         }
         System.out.println("create new and write done");
      } catch (FileNotFoundException e) {
         System.out.println("file not found "+e); // only for input stream
      }catch (IOException e) {
         System.out.println("read/write error "+e); 
      }
   }
}


