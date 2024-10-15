import java.io.*;
public class FileOutputStreamImgEx {
   public static void main(String[] args) {
      try (FileInputStream fin= new FileInputStream("/Users/muhammedfaheem/Desktop/java/day16/img1.jpg"); 
         FileOutputStream fout= new FileOutputStream("/Users/muhammedfaheem/Desktop/java/day16/img11.jpg");){

         int b;
         System.out.println(fin.available());
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
