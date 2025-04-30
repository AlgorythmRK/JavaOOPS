class Car{
     //attributes
     String name="Lambo";
     String color="Black";
     String model="Nika";
     Double price=20000.00;
     
     //methods
     void speed(){
          System.out.println("The speed of the car is nice");
     }

     void sound(){
          System.out.println("The sound of the car is good");
     }

}


public class Main1{
   public static void main(String args[]){
     Car newcar= new Car();
     System.out.println(newcar.color);
     System.out.println(newcar.model);
     
     newcar.speed();
     newcar.sound();

   }
}
