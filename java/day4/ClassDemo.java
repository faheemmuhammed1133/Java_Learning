class Box
{
   double l;
   double b;
   double w;
   
   Box(){
      this.l=this.b=this.w=1;
   }
   Box(double a){
      this.l=this.b=this.w=a;
   }
   Box(double l,double b,double w){
      this.l=l;
      this.b=b;
      this.w=w;
   }
   Box(Box copy){
      this.l=copy.l;
      this.b=copy.b;
      this.w=copy.w;
   }

   void volume(){
      System.out.println(l*b*w);
   }

   public double getW(){
      return w;
   }
   public void setW(double w){
      this.w=w;
   }

   public String toString(){
      return("Dimentsions of Box : width "+w+" length : "+l+" depth : "+b);
   }
}


class ClassDemo 
{
 	public static void main(String args[]) 
	{
      Box uno=new Box();
      Box due=new Box(3);
      Box tre=new Box(3,4,5);
      Box quattro=new Box(tre);
      Box cinque=due;

      due.volume();
      tre.volume();
      quattro.volume();
      cinque.volume();
      
      uno.setW(3);
      uno.volume();

      System.out.println(due.getW());
      System.out.println(uno.toString());
      
		
	} 
}