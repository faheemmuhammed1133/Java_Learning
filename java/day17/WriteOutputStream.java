import java.io.*;
public class WriteOutputStream {
   public static void main(String[] args) throws IOException{
      String f="text4.txt";
      String f1="text5.txt";
      try (FileOutputStream fout=new FileOutputStream(f);
      FileOutputStream fout2=new FileOutputStream(f1);) {
         String s="Hello to the \nWorld of java programming";
         for(int i=0;i<s.length();i++){
            fout.write(s.charAt(i));
         }
         fout2.write(s.getBytes());
      }
      try (FileOutputStream fout=new FileOutputStream(f,true);) {
         String s="This is the first Line \nThis is the second Line";
         byte b[]=s.getBytes();
         fout.write(b);
         fout.write(b,5,2);
         fout.flush();
      }
      try (FileOutputStream fout=new FileOutputStream(f1);)
       {
         String s="This is the Line 1 of sample file \n  this is line 2 of sample file";
         byte b[]=s.getBytes();
         fout.write(b,5,2);
         // fout.write(b,5,106);
         fout.flush();
        
      }
   }
}
