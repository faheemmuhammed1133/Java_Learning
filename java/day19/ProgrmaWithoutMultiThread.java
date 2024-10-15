import java.lang.*;

class Class_1{
   public void show(){
      try {
         for(int i=0;i<5;i++){
            System.out.println("Class_1->"+i);
            Thread.sleep(500);
         }
      }catch(InterruptedException e){
         System.out.println("error "+e.getMessage());
      }
   }
}
class Class_2{
   public void show(){
      try {
         for(int i=0;i<5;i++){
            System.out.println("Class_2->"+i);
            Thread.sleep(500);
         }
      }catch(InterruptedException e){
         System.out.println("error "+e.getMessage());
      }
   }
}
public class ProgrmaWithoutMultiThread {
   public static void main(String[] args) {
      
   }
}
