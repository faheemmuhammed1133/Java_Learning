
import java.util.Scanner;
class GreaterofThree{
   public static void main(String args[]){
      Scanner in= new Scanner(System.in);

      int num= in.nextInt();
      int num1= in.nextInt();
      int num2= in.nextInt();
      if(num>num2 && num>num1){
         System.out.println(num+" is greter");
      }else if(num1>num2 && num1>num){
         System.out.println(num1+ " is greater");
      }else{
         System.out.println(num2+ " is greater");
      }
      in.close();
   }
}