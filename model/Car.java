
package model;
public class Car{
    private String carNumber;
    private String carModel;
    private String OwnerName;
    private long OwnerMobileNo;
    
    public Car(String carNumber, String carModel, String OwnerName, long OwnerMobileNo){
         this.carNumber = carNumber;
         this.carModel = carModel;
         this.OwnerName = OwnerName;
         this.OwnerMobileNo = OwnerMobileNo;
    }
    
    public String getCarNumber(){
         return  carNumber;
    }
    
    public String  getCarModel(){
         return carModel;       
    }
    
    public String getOwnerName(){
         return OwnerName;
    }
    
    public long getOwnerMobileNo(){
         return  OwnerMobileNo;
    }
    
    public String toString(){
         StringBuilder sb = new StringBuilder();
         sb.append("---------------------------------------------\n");
         sb.append(String.format("| %-16s:%-20s|\n","Car number is",getCarNumber()));
         sb.append(String.format("| %-16s:%-20s|\n","Car Model is",getCarModel()));
         sb.append(String.format("| %-16s:%-20s|\n","Car Owner is",getOwnerName()));
         sb.append(String.format("| %-16s:%-20s|\n","Car OwnerNo is",getOwnerMobileNo()));
         sb.append("----------------------------------------------\n");
         return sb.toString();
    }
    
    
    
}                  
    
