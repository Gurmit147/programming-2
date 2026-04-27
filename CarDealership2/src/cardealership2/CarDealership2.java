/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardealership2;

public class CarDealership2 {

    public static void main(String[] args) {
        Car car1 = new Car("Proton","Red","Sedan");
        Car car2 = new Car("Perodua","Blue","Sedan");
        Car car3 = new Car("BMW","Black","SUV");
        Car car4 = new Car("Mercedes","Silver","Coupe");
        
        System.out.println("Brand: " + car1.brand);
        System.out.println("Color: " + car1.color);
        System.out.println("Vehicle Type: " + car1.type);
        System.out.println();
        
        System.out.println("Brand: " + car2.brand);
        System.out.println("Color: " + car2.color);
        System.out.println("Vehicle Type: " + car2.type);
        System.out.println();
        
        System.out.println("Brand: " + car3.brand);
        System.out.println("Color: " + car3.color);
        System.out.println("Vehicle Type: " + car3.type);
        System.out.println();
        
        System.out.println("Brand: " + car4.brand);
        System.out.println("Color: " + car4.color);
        System.out.println("Vehicle Type: " + car4.type);
        System.out.println();
    }
    
}
