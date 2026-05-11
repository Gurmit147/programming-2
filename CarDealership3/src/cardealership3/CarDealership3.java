
package cardealership3;

import java.util.Scanner;
public class CarDealership3 {

   
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        // Input number of cars
        System.out.print("Enter number of cars: ");
        int numCars = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Array to store car objects
        Car[] cars = new Car[numCars];

        // Input car details
        for (int i = 0; i < numCars; i++) {
            System.out.println("\nCar " + (i + 1));

            System.out.print("Enter brand: ");
            String brand = sc.nextLine();

            System.out.print("Enter color: ");
            String color = sc.nextLine();

            System.out.print("Enter vehicle type: ");
            String type = sc.nextLine();

            cars[i] = new Car(brand, color, type);
        }

        // Display car details
        System.out.println("\n===== Car Details =====");

        for (int i = 0; i < numCars; i++) {
            System.out.println("\nCar " + (i + 1));
            System.out.println("Brand: " + cars[i].brand);
            System.out.println("Color: " + cars[i].color);
            System.out.println("Vehicle Type: " + cars[i].type);
        }
    }
    
}
