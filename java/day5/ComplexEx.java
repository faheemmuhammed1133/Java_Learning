class ComplexNum{
   private int real, imag;

   ComplexNum(){
      real=0;
      imag=0;
   }

   public ComplexNum(int real,int imag){
      this.real=real;
      this.imag=imag;
   }

   public int getReal(){
      return real;
   }
   public int getImag(){
      return imag;
   }
   public void setReal(int real){
      this.real=real;
   }
   public void setImag(int imag){
      this.imag=imag;
   }

   public ComplexNum add(ComplexNum a){
      ComplexNum b=new ComplexNum();
      b.real=this.real+a.real;
      b.imag=this.imag+a.imag;
      return b;
   }

   public ComplexNum sub(ComplexNum a){
      ComplexNum b=new ComplexNum();
      b.real=this.real-a.real;
      b.imag=this.imag-a.imag;
      return b;
   }

   public String toString(){
      return ("Complex number : "+this.real+"+"+this.imag+"i");
   }

}

class ComplexEx {
   public static void main(String[] args) {
      ComplexNum a1=new ComplexNum(1,7);
      ComplexNum a2=new ComplexNum(2,4);
      ComplexNum a3=a1.add(a2);
      System.out.println(a3.toString());
      a3=a1.sub(a2);
      System.out.println(a3.toString());
   
   }
}
