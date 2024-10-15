
import java.util.Scanner;
class GreaterofTwo{
   public static void main(String args[]){
      Scanner in= new Scanner(System.in);

      int num= in.nextInt();
      int num2= in.nextInt();
      if(num>num2){
         System.out.println(num+" is greter");
      }else{
         System.out.println(num2+ " is greater");
      }
      in.close();
   }
}