import java.io.*;
public class FileWriterEx {
   public static void main(String[] args){
      String str="we are all born wiht a divine fire in us."+
      "Our efforts should be to give wings to this fire and "+
      "fill the world with the glow of its goodness.";
      int len=str.length();
      char [] buff =new char[len];

      str.getChars(0, str.length(), buff, 0);
      try (
         FileWriter fout=new FileWriter("txtW6.txt");
         FileWriter fout2=new FileWriter("txtW7.txt");
         FileWriter fout3=new FileWriter("txtW8.txt");
         FileWriter fout4=new FileWriter("txtW9.txt");
         FileWriter fout5=new FileWriter("txtW10.txt",true);
         ) {
            fout.write(str);
            fout.append(str.charAt(0));
            
            for(int i=0;i<len/4;i++){
               fout2.write(buff[i]);
            }
            fout2.append("/n");
            StringBuilder sb=new StringBuilder("Appending to fout2");
            fout2.append(str,len/2,len);
            fout2.append(sb);

            fout3.write(buff);
            
            fout4.write(buff,len-len/4,len/4);
            fout4.write("Quote by APJ Abdul Kalam");

            fout5.write(str+"\n");
            fout5.write(str);
         
      }catch(IOException e){
         System.out.println("error in file handling "+e);
      }
   }
}
