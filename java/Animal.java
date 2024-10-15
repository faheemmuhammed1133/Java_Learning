public class Animal {
   boolean vegetarian;
   String food;
   int numOfLegs;
   
   Animal(){
      
   }
   Animal(boolean veg,String f,int l){
      this.vegetarian=veg;
      this.food=f;
      this.numOfLegs=l;
   }

   public int getLegs(){
     return numOfLegs;
   }

   public void setFood(String f){
      this.food=f;
   }

   public String toString(){
      return ("Animal of "+numOfLegs+" legs is a "+vegetarian+" vegetarian and loves "+food);
   }
   
}

class Cat extends Animal{
   String color;

   Cat(){
      super();
   }
   Cat(String c, boolean veg , String f , int l){
      super(false,f,l);
      this.color=c;
   }

   public String toString(){
      return ("Cat is a Animal of "+numOfLegs+" legs is a "+vegetarian+" vegetarian and loves "+food);
   }
}

class Cow extends Animal{
   String breed;

   Cow(){
      super();
   }
   Cow(String b, boolean veg , String f , int l){
      super(veg,f,l);
      this.breed=b;
   }

   public String toString(){
      return ("Cow is a Animal of "+numOfLegs+" legs is a "+vegetarian+" vegetarian and loves "+food);
   }
}

class AnimalInheritance{
   public static void main(String[] args) {
      // code for above classes

      
   }
}