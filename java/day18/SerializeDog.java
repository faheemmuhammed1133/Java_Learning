import java.io.*;
class Dog implements Serializable{
   String breed;
   String name;
   public Dog(String breed,String name){
      this.breed=breed;
      this.name=name;
   }
   public String toString(){
      return "breed : "+breed+", name : "+name;
   }
}

public class SerializeDog {
   public static void main(String[] args) {
      Dog s=new Dog("Shih Tzu", "Prem");
      try (ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("SerialDOg.ser"));) {
         os.writeObject(s);
      } catch (IOException e) {
         System.out.println("Exception in serialization"+e);
      }

      try (ObjectInputStream is=new ObjectInputStream(new FileInputStream("SerialDog.ser"))) {
         Dog s2=(Dog)is.readObject();
         System.out.println(s2);
      } catch (IOException e) {
         System.out.println("Exception in Deserialization");
      }catch (ClassNotFoundException e) {
         System.out.println("Class not found Exception");
      }
   }
}
