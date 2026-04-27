/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardealership2;

public class Car {
    String brand;
    String color;
    String type;
    
    public Car(String brand, String color, String type){
        this.brand = brand;
        this.color = color;
        this.type = type;
        
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Vehicle Type: " + type);
        System.out.println();
    }
    
}
