abstract class Figure{
   double length,breadth;
   abstract double area();
}

class Triangle extends Figure{
   Triangle(double l,double b){
      this.length=l;
      this.breadth=b;
   }
   double area(){
      return (this.breadth*this.length*.5);
   }
}

class Rectangle extends Figure{

   Rectangle(double l,double b){
      this.length=l;
      this.breadth=b;
   }
   double area(){
      return (this.breadth*this.length);
   }
}

class Square extends Figure{

   Square(double a){
      this.length=this.breadth=a;
      
   }
   double area(){
      return (this.breadth*this.length);
   }
}

public class TestFigure {
   public static void main(String[] args) {
      Figure f;

      f=new Rectangle(10, 6);
      System.out.println(" Area of Rectangle is : "+f.area());

      f=new Triangle(6, 4);
      System.out.println(" Area of Triangle is : "+f.area());

      f=new Square(7);
      System.out.println(" Area of Square is : "+f.area());
   }
   
}
