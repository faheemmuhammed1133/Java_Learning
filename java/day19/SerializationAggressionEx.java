import java.io.*;

class Address implements Serializable{
   String flatNo;
   String society;
   Address(String f,String s){
      flatNo=f;
      society=s;
   }
   public String toString(){
      return "FlatNo : "+flatNo+"\n Society : "+society;
   } 
}

class Person implements Serializable{
   int id;
   String name;
   Person (int id,String n){
      this.id=id;
      this.name=n;
   }
   public String toString(){
      return "id : "+id+" name : "+name;
   }
}

class Student extends Person{
   int rollno ;
   String course;
   Address addr;
   public Student(int id,String name ,int rollno ,String course, Address addr){
      super(id, name);
      this.rollno=rollno;
      this.course=course;
      this.addr=addr;
   }
   public String toString(){
      System.out.println(super.toString());
      return "rollno "+rollno+" course "+course+" address "+addr;
   }
}

public class SerializationAggressionEx {
   public static void main(String[] args) {
      Student s1 = new Student(1, "Stud1", 111, "AAA", new Address("333", "SocA"));
      System.out.println(s1);

      try (ObjectOutputStream os =new ObjectOutputStream(new FileOutputStream("serialstud.txt"))) {
         os.writeObject(s1);         
      } catch (IOException e) {
        System.out.println("error in serialization "+e );
        
      }
      
      try (ObjectInputStream is=new ObjectInputStream(new FileInputStream("serialstud.txt"))) {
         Student s2=(Student)is.readObject();
         System.out.println("");
         System.out.println(s2);
      } catch (IOException e) {
         System.out.println("error in Deserialization "+e.getMessage() );
      }catch(ClassNotFoundException e){
         System.out.println("class not found Exception "+e.getMessage());
      }
   }
}
