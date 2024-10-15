import java.util.Scanner;
class AverageofTen{
   public static void main(String args[]){
      Scanner in= new Scanner(System.in);
   float n=in.nextFloat();
      float avg=(n*(n+1)/2)/n;
         System.out.println("Average of 1 - 10  is "+avg );
         in.close();
   }
}