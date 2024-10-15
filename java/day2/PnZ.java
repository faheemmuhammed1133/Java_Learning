import java.util.Scanner;
class PnZ{
   public static void main(String args[]){
      Scanner in= new Scanner(System.in);

      int num= in.nextInt();
      if(num==0){
         System.out.println("zero");
      }else if(num<0){
         System.out.println("negative");
      }else{
         System.out.println("positive");
      }
      in.close();
   }
}