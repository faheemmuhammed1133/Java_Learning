
// wap to create 3 thread , 1st print hello 5 times, 2nd print hi 5 times and 3rd will 
// print bye 5 times. in main print begin and end

public class AnonymousClassMultiTask {
   public static void main(String[] args) {
      System.out.println("Begin \n");
      Thread t1=new Thread() {
         public void run(){
            try {
               for (int i = 0; i < 5; i++) {
                  System.out.println("Thread1 -> Hello -> "+i);
                  Thread.sleep(500);
               }
            } catch (InterruptedException e) {
               System.out.println("Thread1 interrupted "+e.getMessage());
            }
         }
      };
      Thread t2=new Thread(new Runnable() {
         public void run(){
                  try {
                     for (int i = 0; i < 5; i++) {
                        System.out.println("Thread2 -> Hi -> "+i);
                        Thread.sleep(500);
                     }
                  } catch (InterruptedException e) {
                     System.out.println("Thread1 interrupted "+e.getMessage());
                  }
               }
      });
      Thread t3=new Thread(new Runnable() {
         public void run(){
                  try {
                     for (int i = 0; i < 5; i++) {
                        System.out.println("Thread3 -> Bye -> "+i);
                        Thread.sleep(500);
                     }
                  } catch (InterruptedException e) {
                     System.out.println("Thread1 interrupted "+e.getMessage());
                  }
               }
      });
      t1.start();
      t2.start();
      t3.start();
      System.out.println("End \n");
   }
   
}


   

