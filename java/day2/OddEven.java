import java.util.Scanner;
class OddEven{
   public static void main(String args[]){
      Scanner in= new Scanner(System.in);

      int num= in.nextInt();
      if(num%2==0){
         System.out.println("even");
      }else{
         System.out.println("odd");
      }
      in.close();
   }
}