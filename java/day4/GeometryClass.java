class Geometry {
   public void calculateArea(double r){
      System.out.println("area of circle is "+3.14*r*r);
   }
   
   public void calculateArea(int a){
         System.out.println("area of square is "+a*a);
      }

   public void calculateArea(int l,int b){
         System.out.println("area of rectange is "+l*b);
      }
}
class GeometryClass {
   public static void main(String[] args) {
      Geometry c =new Geometry();

      c.calculateArea(3.7);
      c.calculateArea(3);
      c.calculateArea(7,8);
   }
}
