class Rectangle{
   double len,breadth;

   Rectangle(){
      len=0;
      breadth=0;
   }
   Rectangle(double l,double b){
      this.len=l;
      this.breadth=b;
   }

   public double perimeter(){
      return 2*(len+breadth);
   }
   public double area(){
      return (len*breadth);
   }
   
   public String toString(){
      return ("Rectange has length : "+len+" and breadth : "+breadth+" .");
   }
}

public class RectangleDemo {
   public static void main(String[] args) {

      Rectangle a=new Rectangle(3,4);
      System.out.println(a.area());
      System.out.println(a.perimeter());
      
   }
}
