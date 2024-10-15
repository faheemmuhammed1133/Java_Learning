// wap in which you have to make a class student and student has id, bname, marks

class Student {

   int std_id;
   String studentName;
   float marks;

   void add_Data(int s_id,String sN,float m){
      this.std_id=s_id;
      this.studentName=sN;
      this.marks=m;
   }
   void display(){
      System.out.println("student id  "+ std_id);
      System.out.println("student name  "+ studentName);
      System.out.println("student marks  "+ marks);
   }

   public void setMarks(float marks) {
      this.marks = marks;
   }

   public float getMarks() {
      return marks;
   }
}

class ClassEx{
   public static void main(String[] args){
      Student s1=new Student();
      Student s2=new Student();
      Student s3=new Student();

      s1.add_Data(1,"Garvit 1",67.7f);
      s2.add_Data(2,"Garvit 2",68.8f);
      s3.add_Data(3,"Garvit 3",69.9f);

      s1.display();
      s2.display();
      s3.display();

      s1.setMarks(35);
      System.out.println(s1.getMarks());

      

   }
}