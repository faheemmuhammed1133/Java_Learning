
import java.util.Scanner;
class MulT{
   public static void main(String args[]){
      Scanner in= new Scanner(System.in);

      int a=in.nextInt();
      for(int i=1;i<=10;i++){
         System.out.println(i+" x "+a+" = "+i*a+"\n");
      }
      in.close();
   }
}