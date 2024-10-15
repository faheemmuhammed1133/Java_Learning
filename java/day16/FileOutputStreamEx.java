import java.io.*;

public class FileOutputStreamEx {
   public static void main(String[] args) {
      try(FileOutputStream fout =new FileOutputStream("filecheck.txt")){
         String s= "Welcome java learners";
         byte b[]=s.getBytes();
         fout.write(b);
         System.out.println("written in file ");
         
      }catch(FileNotFoundException e){
         System.out.println("File not found "+ e );
      }catch(IOException e ){
         System.out.println("IOexception "+e);
      }
   }
}


