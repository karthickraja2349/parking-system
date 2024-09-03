package view;
import java.util.Scanner;
import controller.CarPortSystem;
import model.Car;

public class carPortManagement{
     private CarPortSystem carPortSystem = null;
     private Scanner input = new Scanner(System.in);  
     protected  carPortManagement(){
        carPortSystem = CarPortSystem.getCarPortSystemInstance();
     }
   
             
                      //get Car Number
      public  void  parkCar(){
            input.nextLine();
            System.out.println("Enter the car number:");   
            String  carNumber =  input.nextLine();
            System.out.println("Enter the car model:");
            String model = input.nextLine();
            System.out.println("Enter the car owner name:");
            String ownerName = input.nextLine();
            System.out.println("Enter Owner Mobile Number:");
            long mobileNumber = input.nextLong();

            if(carNumber.length()==9 || carNumber.length()==10){
                 Car car = new Car(carNumber, model, ownerName, mobileNumber);
                 carPortSystem.parkCar(car);
            }
           else{
               System.out.println("Invalid car Number!");
               return;
          }
     }            
     
                  // take car
     public void  takeCar(){
             System.out.println("Enter the car number:");   
             String  carNumber =  input.nextLine();
             if(carNumber.length()==9 || carNumber.length()==10){
                 carPortSystem.removeCar(carNumber);
            }
           else{
               System.out.println("Invalid car Number!");
               return;
         }
    }      
             //view status
    public void viewParkingDetails(){
          System.out.println("Parking lot status");
          System.out.println("---------------------------------");
          carPortSystem.displayStatus();
           System.out.println("---------------------------------");
     }
}     
