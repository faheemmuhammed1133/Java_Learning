interface Bank{
   float getRateOfInterest();
}

class Sbi implements Bank{
   public float getRateOfInterest(){
      return 7.0f;
   }
}
class Pnb implements Bank{
   public float getRateOfInterest(){
      return 6.6f;
   }
}

public class TestBank2 {
   public static void main(String[] args) {
      Bank a;

      a=new Sbi();
      System.out.println("rate of interest at SBI : "+a.getRateOfInterest()+"%");
      a=new Pnb();
      System.out.println("rate of interest at PNB : "+a.getRateOfInterest()+"%");
   }
   
}
