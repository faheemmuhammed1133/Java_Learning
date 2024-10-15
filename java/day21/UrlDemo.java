import java.net.*;   
public class UrlDemo {
   public static void main(String[] args) {
      try {
         URL url=new URL("https://www.google.com/index.html");
         System.out.println("Protocol "+url.getProtocol());
         System.out.println("Host name "+url.getHost());
         System.out.println("port name "+url.getPort());
         System.out.println("File name "+url.getFile());

      } catch (Exception e) {
         System.out.println(e);
      }
   }
}
