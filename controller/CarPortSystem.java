package controller;
import java.util.Map;
import java.util.HashMap; 
import model.Car;

public class CarPortSystem{

         private static final int TOTAL_PARKING_SLOTS = 40;
         private Map<Integer, Object>parkingLot ;
         public static CarPortSystem carPortSystem = null;
         
         private CarPortSystem(){
             parkingLot = new HashMap<>();
             for(int i=1;i<=TOTAL_PARKING_SLOTS;i++){
                 parkingLot.put(i,null);
            } 
        }
         
         public static CarPortSystem getCarPortSystemInstance(){
              if(carPortSystem == null){
                   carPortSystem = new CarPortSystem();
              }
              return carPortSystem ;
        }          
         
       
                              //parking car 
          private boolean isCarPresent(String carNumber) {
              for (Object value : parkingLot.values()) {
                if (value instanceof Car && ((Car) value).getCarNumber().equals(carNumber)) {
                   return true; // Car is found 
                }
              }
              return false; // Car  not found
         }
                           
          public boolean parkCar(Car car) {
               if (isCarPresent(car.getCarNumber())) {
                 System.out.println("Car with car number " + car.getCarNumber() + " is already parked.");
                 return false;
               }
                           
              for (Map.Entry<Integer,Object> entry : parkingLot.entrySet()) {
                 if (entry.getValue() == null) {
                    parkingLot.put(entry.getKey(), car);
                    System.out.println("Car parked at spot number " + entry.getKey());
                    return true;
                 }
               }
               System.out.println("Parking slot is full");
               return false;    
          }
      
                            //remove car
      public boolean removeCar(String carNumber){
            for(Map.Entry<Integer,Object>entry : parkingLot.entrySet()){
               if(carNumber.equals(entry.getValue())){
                   parkingLot.put(entry.getKey(),null);
                   System.out.println(carNumber + " " + "was taken successfully");
                   return true;
              }
           }
           System.out.println("Car with carNumber:" + carNumber + " " + " was not found");
           return false;                              
     }
     
                        //display parking status
     
     
     public void displayStatus(){
          for(Map.Entry<Integer,Object> entry : parkingLot.entrySet()){
               System.out.println("Spot:" + entry.getKey()); 
               System.out.println((entry.getValue() == null ? "Empty" : entry.getValue()));
          }
     }           
}     
