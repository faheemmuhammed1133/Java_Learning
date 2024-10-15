import java.lang.*;
// wap to create your own thread by extending thread class in a program

class CreateThread1 extends Thread {
   CreateThread1(){
      super("Thread1");
   }
   public void run(){
      System.out.println("Child Thread "+Thread.currentThread());
   }
}
public class ThreadCreateDemo {
   public static void main(String[] args) {
      CreateThread1 c1=new CreateThread1();
      c1.start();
      System.out.println("Main Thread "+Thread.currentThread());
   }
}
