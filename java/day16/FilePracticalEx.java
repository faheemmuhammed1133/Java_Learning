import java.io.IOException;
import java.io.File;

public class FilePracticalEx {
   public static void main(String args[]) throws IOException {

      File f =new File("/Users/muhammedfaheem/Desktop/java/day16/file123.txt");
      if(f.exists()){
         System.out.println("File name "+f.getName());
         System.out.println("File path "+f.getPath());
         System.out.println("Abs path "+f.getAbsolutePath());
         System.out.println("parent "+f.getParent());
         System.out.println(f.exists() ? "exists ":"does not exists");
         System.out.println((f.isDirectory() ? " ":"not ")+" a directory");
         System.out.println((f.isFile() ? " ":"not ")+" a file");
         System.out.println((f.isAbsolute() ? "is ":"is not ")+" absolute");
         System.out.println("File last modified "+f.lastModified());
         System.out.println("File size "+f.length()+" Bytes");
         
      }
      
      File f1 =new File("/Users/muhammedfaheem/Desktop/java/day16/file456.txt");
      System.out.println(f1.createNewFile());

      File dir1 = new File("/Users/muhammedfaheem/Desktop/java/day16/dir1");
      System.out.println(dir1.mkdir());
      
      File dir2_subDir1 = new File("/Users/muhammedfaheem/Desktop/java/day16/dir2/subDir1");
      System.out.println(dir2_subDir1.mkdirs());

      File dir2 = new File("/Users/muhammedfaheem/Desktop/java/day16/dir2");

      File dir_f1 = new File("/Users/muhammedfaheem/Desktop/java/day16/dir2/file11.txt");
      dir_f1.createNewFile();
      File dir_f2 = new File("/Users/muhammedfaheem/Desktop/java/day16/dir2/file22.txt");
      dir_f2.createNewFile();

      System.out.println("Files in dir2 : ");
      if (dir2.isDirectory()) {
         for(File sub : dir2.listFiles()){
            System.out.println(" -> "+sub.getName());
         }
      }

      File f2 =new File("/Users/muhammedfaheem/Desktop/java/day16/file654.txt");
      System.out.println(f1.renameTo(f2));

      System.out.println("length of file123 -> "+f.length()+" bytes");
   }
}
