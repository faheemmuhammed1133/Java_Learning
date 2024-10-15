import java.io.*;

public class BufferInputOutputStreamEx {
   public static void main(String[] args) {
      try (BufferedInputStream fin=new BufferedInputStream(new FileInputStream("filecheck.txt"));
         BufferedOutputStream fout=new BufferedOutputStream(new FileOutputStream("filecheck2.txt"))) {
         
            byte[] buffer=new byte[1024];
            int lenRead;
            while ((lenRead=fin.read(buffer))>0) {
               fout.write(buffer, 0, lenRead);
               fout.flush();
            }
            System.out.println("done working");
      }
       catch (FileNotFoundException e) {
         System.out.println("file not found"+e);
      }
       catch (IOException e) {
         System.out.println(" error in file handling "+e);
      }
   }
}
