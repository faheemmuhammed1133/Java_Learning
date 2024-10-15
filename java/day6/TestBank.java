abstract class Bank{
   abstract int getRateOfInterest();
}

class Sbi extends Bank{
   public int getRateOfInterest(){
      return 7;
   }
}
class Pnb extends Bank{
   public int getRateOfInterest(){
      return 6;
   }
}

public class TestBank {
   public static void main(String[] args) {
      Bank a;

      a=new Sbi();
      System.out.println("rate of interest at SBI : "+a.getRateOfInterest()+"%");
      a=new Pnb();
      System.out.println("rate of interest at PNB : "+a.getRateOfInterest()+"%");
   }
   
}
