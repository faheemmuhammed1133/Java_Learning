import java.io.IOException;
import java.io.File;
public class FileClasEx {
   public static void main(String[] args) throws IOException{
      File f1=new File("module/iofile");
      // File f1=new File("module/iofile");
      // File f1=new File("module/iofile");
      // File f1=new File("module/iofile");
      if (f1.exists()) {
         System.out.println("File name "+f1.getName());
         System.out.println("File path "+f1.getPath());
         System.out.println("Abs path "+f1.getAbsolutePath());
         System.out.println("parent "+f1.getParent());
         System.out.println(f1.exists() ? "exists ":"does not exists");
         System.out.println((f1.isDirectory() ? " ":"not ")+" a directory");
         System.out.println((f1.isFile() ? " ":"not ")+" a file");
         System.out.println((f1.isAbsolute() ? "is ":"is not ")+" absolute");
         System.out.println("File last modified "+f1.lastModified());
         System.out.println("File size "+f1.length()+" Bytes");
         
         if (f1.isDirectory()) {
            for(File sub : f1.listFiles()){
               System.out.println(" -> "+sub);
            }
         }
         
         File obj =new File("/Users/muhammedfaheem/Desktop/java/DAY15/module/iofile/file.txt");
         System.out.println(obj.createNewFile() );// throws ioexception // returns boolean
         System.out.println((obj.isAbsolute() ? "is ":"is not ")+" absolute");
         
         File obj1 = new File("/Users/muhammedfaheem/Desktop/java/DAY15/module/iofile/filetry");
         System.out.println(obj1.mkdir());

         File obj2 = new File("/Users/muhammedfaheem/Desktop/java/DAY15/module/iofile2/filetry");
         System.out.println(obj2.mkdirs());

         File obj3 = new File("/Users/muhammedfaheem/Desktop/java/DAY15/module/iofile/filetry2_1");
         System.out.println(obj1.renameTo(obj3));

         File obj4 = new File("/Users/muhammedfaheem/Desktop/java/DAY15/module/iofile/file2_1.txt");
         System.out.println(obj.renameTo(obj4));

         
      }
   }
   
}
