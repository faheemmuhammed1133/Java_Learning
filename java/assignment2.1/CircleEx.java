/*WAP to create a class called Circle. It contains:
• private instance variable: radius (of the type double) with default value of 1.0.
• Two overloaded constructors - a default constructor with no argument, and a constructor
which takes a double argument for radius.
• Two public methods: getRadius(), calculateArea(), calculateCircumference() which return
the radius, calculate and return area, and circumference respectively.
Hint: Use Math.PI for calculating area and circumference*/

class Circle{
   private double r;

   Circle(){
      r=1.0;
   }
   Circle(double r){
      this.r=r;
   }

   public double getRadius(){
      return this.r;
   }

   public double calculateArea(){
      return (r*Math.PI*r);
   }
   public double calculateCircumference(){
      return (2*Math.PI*r);
   }
}

public class CircleEx {

   public static void main(String[] args) {
      Circle c=new Circle();
      Circle c1=new Circle(2.5);

      System.out.println(c.getRadius());
      System.out.println(c1.getRadius());
      System.out.println(c.calculateArea());
      System.out.println(c1.calculateArea());
      System.out.println(c.calculateCircumference());
      System.out.println(c1.calculateCircumference());
      
   }
}