
import java.util.Scanner;
class PrimeorNot{
   public static void main(String args[]){
      Scanner in= new Scanner(System.in);
      int n=in.nextInt();
      boolean prime=true;
      for(int i=2;i<n/2+1;i++){
            if (n%i==0 ){ 
               prime=false;
            }
      }      
      if(prime){
         System.out.println(n+" is a prime");
      }else{
         System.out.println(n+" is not a prime");

      }
      in.close();
   }
}