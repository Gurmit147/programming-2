
package cardealership;


 
public class CarDealership {

    
    public static void main(String[] args) {
        
        String name = "Gurmit";
        
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        
        car1.brand = "Proton";
        car1.color = "Red";
        car1.type = "sedan";
        
        car2.brand = "Perodua";
        car2.color = "Blue";
        car2.type = "sedan";
        
        car3.brand = "BMW";
        car3.color = "Black";
        car3.type = "SUV";
        
        car4.brand = "Mercedes";
        car4.color = "Silver";
        car4.type = "Coupe";
        
        car1.showdetails();
        car2.showdetails();
        car3.showdetails();
        car4.showdetails();
        
        car1.showname(name);
        
    }
    
}
