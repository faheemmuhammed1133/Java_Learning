import java.io.*;
class Student implements Serializable{
   transient int rollno;
   String name;
   static String college="SSS";
   public Student(int rollno,String name){
      this.rollno=rollno;
      this.name=name;
   }
   public String toString(){
      return "rollno : "+rollno+", name : "+name+ ", college : "+college;
   }
}

public class SerializationStaticTransientEx {
   public static void main(String[] args) {
      Student s=new Student(111, "Thatikonda");
      Student.college="CCC";
      try (ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("SerialStud.ser"));) {
         os.writeObject(s);
      } catch (IOException e) {
         System.out.println("Exception in serialization"+e);
      }

      try (ObjectInputStream is=new ObjectInputStream(new FileInputStream("SerialStud.ser"))) {
         Student s2=(Student)is.readObject();
         System.out.println(s2);
      } catch (IOException e) {
         System.out.println("Exception in Deserialization");
      }catch (ClassNotFoundException e) {
         System.out.println("Class not found Exception");
      }
   }
}
