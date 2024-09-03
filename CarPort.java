import java.util.Scanner;

import view.carPortManagement;

public class CarPort extends carPortManagement{
     private Scanner input = new Scanner(System.in);
     private static CarPort carPort = new CarPort();
     
     public static void main(String[]args){
            carPort.CarPark();
     }
     
     public  void CarPark(){
             while(true){
                  displayMenu();
                  
                  while(!input.hasNextInt()){
                         System.out.println("Invalid input . please enter a number");
                         input.nextInt();
                   } 
                  int choice =input.nextInt();
                  switch(choice){
                        case 1 :
                               adminMenu();
                               break;
                        case 2 : 
                               carGeekMenu();
                               break;
                        case 3 : 
                               exitMenu();
                                break;
                        default :
                                System.out.println("Invalid choice! please enter a valid choice");
                  }                                    
            }
     }       
     
     
     private  void displayMenu(){
            System.out.println("Welcome to the CarPort");
            System.out.println("Your trust builds us");
            System.out.println("---------------------------------");
            System.out.println("|Option| MainMenu|");
            System.out.println("-----------+-----------------|");
            System.out.println("|   1     |  Admin      |");
            System.out.println("|   2     |  Car geek  |");
            System.out.println("|   3     |  Exit          |");
            System.out.println("---------------------------------"); 
            System.out.println("Enter your choice");
      }        
      
      private  void adminMenu(){
            while(true){
             
                  System.out.println("--------------------------------------");     
                  System.out.println("|Option | MainMenu      |");
                  System.out.println("|   1       |  Login Admin  |");
                  System.out.println("|   2       |  Add Employer|");
                  System.out.println("|   3       |  ViewDetails    |");
                  System.out.println("|   4       |  Back               |");
                  System.out.println("--------------------------------------");  
                  System.out.println("Enter your choice");
                  
                  int adminChoice = input.nextInt();
                  switch(adminChoice){
                        case 1 :
                           //  adminLogin();
                             break;
                        case 2 :
                           //   getEmployerDetails();
                              break;
                        case 3:
                               viewParkingDetails();
                               break;      
                        case 4 :
                               return ;
                        default :
                              System.err.println("Enter a valid choice , you enter as"+ adminChoice );      
                 }    
          }
     }                     
     
     private void carGeekMenu(){
             while(true){
                  System.out.println("--------------------------------------");     
                  System.out.println("|Option | CarGeekMenu|");
                  System.out.println("------------+-----------------------|");
                  System.out.println("|  1        |  Park car        |");
                  System.out.println("|  2        |  Take car        |");   
                  System.out.println("|  3        |  Back              |");
                  System.out.println("--------------------------------------");    
                  System.out.println("Enter your choice");
                  
                  int carGeekChoice = input.nextInt();
                  switch(carGeekChoice){
                        case 1:
                              parkCar();
                              break;
                        case 2: 
                              takeCar();
                              break;
                         case 3:
                               return;
                         default :
                              System.out.println("Enter a valid choice , you enter as"+ carGeekChoice ); 
                 }
            }
     }                         
     
     
     private void exitMenu(){
          while(true){
                 System.out.println("--------------------------------------");     
                 System.out.println("|Option | ExitMenu       |");
                 System.out.println("------------+-----------------------|");
                 System.out.println("|  1        |   confirm exit |");
                 System.out.println("|  2        |   Stay here     |");
                 System.out.println("--------------------------------------");     
                 
                 int choice = input.nextInt();                 
                 switch(choice){
                      case 1: 
                            System.out.println("Thankyou for visiting us ! ");
                            System.exit(0);
                      case 2:
                            return;
                     default:
                            System.out.println("Invalid choice, Please Select Valid choice: " + choice);
                 }
         }
    }
 
 
}                
                 
